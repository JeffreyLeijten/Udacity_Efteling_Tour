package com.example.android.eftelingtour;

/**
 * Created by Jeffrey on 26-5-2017.
 */

public class Attraction {
    private String name;
    private int imageResourceId;

    public Attraction(String pName, int pImageResourceId){
        name = pName;
        imageResourceId = pImageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
