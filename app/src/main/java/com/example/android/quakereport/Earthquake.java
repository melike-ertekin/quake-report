package com.example.android.quakereport;

/*
 *{@link Earthquake} contains information related to single earthquake
 * */
public class Earthquake {

    // Magnitude of the earthquake
    private double mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Date of the earthquake
    private long mTimeInMilliseconds;

    /**
     * Create a new Word object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location  is the city location of the earthquake
     * @param timeInMilliseconds      is unix time of the earthquake
     */

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }


    /*
     * Returns the magnitude of the earthquake
     * */
    public double getMagnitude() {
        return mMagnitude;
    }

    /*
     * Returns the location of the earthquake
     * */
    public String getLocation() {
        return mLocation;
    }

    /*
     * Returns the TimeInMilliseconds of the earthquake
     * */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}


