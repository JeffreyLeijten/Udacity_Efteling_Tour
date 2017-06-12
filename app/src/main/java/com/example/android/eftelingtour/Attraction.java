package com.example.android.eftelingtour;

/**
 * Created by Jeffrey on 26-5-2017.
 */

public class Attraction {
    private String name;
    private String area;
    private int minimumLength;
    private int supervisionLength;
    private String description;
    private int imageResourceId;

    public Attraction(String pName, String pArea, int pMinimumLength, int pSupervisionLength, String pDescription, int pImageResourceId){
        name = pName;
        area = pArea;
        minimumLength = pMinimumLength;
        supervisionLength = pSupervisionLength;
        description = pDescription;
        imageResourceId = pImageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getArea() {
        return area;
    }

    public int getMinimumLength() {
        return minimumLength;
    }

    public int getSupervisionLength() {
        return supervisionLength;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", minimumLength=" + minimumLength +
                ", supervisionLength=" + supervisionLength +
                ", description='" + description + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
