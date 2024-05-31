package edu.upc.dsa.kebabsimulator_android.models;

public class Ranking {
    private String imageUrl;
    private String userName;
    private int points;
    public Ranking(){}
    public Ranking(String imageUrl, String userName, int points) {
        this.imageUrl = imageUrl;
        this.userName = userName;
        this.points = points;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
