package edu.upc.dsa.kebabsimulator_android;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import edu.upc.dsa.kebabsimulator_android.models.Ranking;


public class RankingAdapter extends RecyclerView.Adapter<RankingAdapter.ViewHolder> {
    public List<Ranking> values;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtUserName;
        public TextView txtPoints;
        public ImageView imageView;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtUserName = v.findViewById(R.id.userName);
            txtPoints = v.findViewById(R.id.points);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }


    public void setData(List<Ranking> myDataset) {
        values = myDataset;
        notifyDataSetChanged();
        Log.d("API", "setData called:"+getItemCount());
    }

    public void add(int position, Ranking item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }

    public RankingAdapter() {
        values = new ArrayList<>();
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RankingAdapter(List<Ranking> myDataset) {
        values = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.ranking_row_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Ranking w = values.get(position);
        final String name = w.getUserName();
        holder.txtUserName.setText(name);
        holder.txtPoints.setText("Points: " + w.getPoints());
        Picasso.get().load(w.getUrl()).into(holder.imageView);
        /*holder.txtWeaponName.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(holder.getAdapterPosition());
            }
        });*/





      /*  GlideApp.with(holder.icon.getContext())
                .load(c.avatar_url)
                .into(holder.icon);

       */


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }


}