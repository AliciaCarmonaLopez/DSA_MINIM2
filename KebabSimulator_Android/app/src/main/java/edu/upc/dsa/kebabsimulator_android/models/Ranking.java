package edu.upc.dsa.kebabsimulator_android.models;

public class Ranking {
    private String url;
    private String userName;
    private int points;
    public Ranking(){}
    public Ranking(int points, String imageUrl, String userName) {
        this.url = imageUrl;
        this.userName = userName;
        this.points = points;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
