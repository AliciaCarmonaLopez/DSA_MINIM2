package edu.upc.dsa.kebabsimulator_android;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.upc.dsa.kebabsimulator_android.models.API;
import edu.upc.dsa.kebabsimulator_android.models.Ranking;
import edu.upc.dsa.kebabsimulator_android.models.Weapon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RankingActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RankingAdapter adapter;
    private List<Ranking> messageList;
    private final String TAG = RankingActivity.class.getSimpleName();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ranking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = (RecyclerView) findViewById(R.id.myRecylcerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager

        // Set the adapter
        adapter = new RankingAdapter();
        recyclerView.setAdapter(adapter);
        //progressBar.setVisibility(View.VISIBLE);
        try {
            doApiCall();
        } catch (Exception e) {
            Log.w(TAG,"excp", e);
            throw new RuntimeException(e);
        }
    }


    private void doApiCall() {
        API apiService = API.retrofit.create(API.class);
        Call<List<Weapon>> call = apiService.weapons();

        call.enqueue(new Callback<List<Weapon>>() {
            @Override
            public void onResponse(Call<List<Weapon>> call, Response<List<Weapon>> response) {
                int code = response.code();
                List<Weapon> weaponList = response.body();
                if (response.isSuccessful() && response.body() != null) {
                    adapter.setData(response.body());
                    adapter.notifyDataSetChanged();
                } else {
                    Log.w(TAG, "Respuesta no exitosa o cuerpo nulo, HTTP " + response.code());
                    Toast.makeText(RankingActivity.this, "Failed to retrieve data. HTTP code: " + response.code(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<List<Weapon>> call, Throwable t) {
                Log.e(TAG, "Error in Retrofit: " + t.toString());
                Toast.makeText(RankingActivity.this, "Network error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}