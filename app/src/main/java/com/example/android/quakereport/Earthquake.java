package com.example.android.quakereport;

/*
 *{@link Earthquake} contains information related to single earthquake
 * */
public class Earthquake {

    // Magnitude of the earthquake
    private String mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Date of the earthquake
    private String mDate;

    /**
     * Create a new Word object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location  is the city location of the earthquake
     * @param date      is the date the earthquake happened
     */

    public Earthquake(String magnitude, String location, String date) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
    }


    /*
     * Returns the magnitude of the earthquake
     * */
    public String getMagnitude() {
        return mMagnitude;
    }

    /*
     * Returns the location of the earthquake
     * */
    public String getLocation() {
        return mLocation;
    }

    /*
     * Returns the date of the earthquake
     * */
    public String getDate() {
        return mDate;
    }
}


