
package com.example.android.weatho.data;

import android.content.Context;

public class WeathoPreferences {

    /*
     * Human readable location string, provided by the API.  Because for styling,
     * "Mountain View" is more recognizable than 94043.
     */
    public static final String PREF_CITY_NAME = "city_name";

    /*
     * In order to uniquely pinpoint the location on the map when we launch the
     * map intent, we store the latitude and longitude.
     */
    public static final String PREF_COORD_LAT = "coord_lat";
    public static final String PREF_COORD_LONG = "coord_long";

    /*
     * Before you implement methods to return your REAL preference for location,
     * we provide some default values to work with.
     */
    private static final String DEFAULT_WEATHER_LOCATION = "94043,USA";
    private static final double[] DEFAULT_WEATHER_COORDINATES = {37.4284, 122.0724};

    private static final String DEFAULT_MAP_LOCATION =
            "1600 Amphitheatre Parkway, Mountain View, CA 94043";




    /**
     * Returns the location currently set in Preferences.
     *
     */
    public static String getPreferredWeatherLocation(Context context) {
        /** This will be implemented in a future lesson **/
        return getDefaultWeatherLocation();
    }

    /**
     * Returns true if the user has selected metric temperature display.
     *
     * @param context Context used to get the SharedPreferences
     * @return true If metric display should be used
     */
    public static boolean isMetric(Context context) {
        /** This will be implemented in a future lesson **/
        return true;
    }

    public static double[] getLocationCoordinates(Context context) {
        return getDefaultWeatherCoordinates();
    }
}
