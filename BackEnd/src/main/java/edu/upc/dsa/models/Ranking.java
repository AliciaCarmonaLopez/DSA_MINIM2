package edu.upc.dsa.models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ranking {
    private String userName;
    private String url;
    private int points;

    // Constructor
    public Ranking() {
    }

    public Ranking(String nombre, String url, int points) {
        this.userName = nombre;
        this.url = url;
        this.points = points;
    }

    // Getters y Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String nombre) {
        this.userName = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int mensaje) {
        this.points = mensaje;
    }
}
