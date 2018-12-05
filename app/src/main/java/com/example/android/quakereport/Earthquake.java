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

    private String mUrl;
    /**
     * Create a new Word object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location  is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
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


