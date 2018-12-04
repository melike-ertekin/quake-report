package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link EarthquakeAdapter} knows how to create a list item layout for each earthquake
 * (a list of {@link Earthquake} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Constructs a new {@link EarthquakeAdapter}.
     *
     * @param context     of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID magnitude
        TextView magnitudeTextView = listItemView.findViewById(R.id.magnitude);
        // Get the magnitude from the  currentEarthquake object and
        // set this text on the magnitudeTextView
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID location
        TextView locationTextView = listItemView.findViewById(R.id.location);
        // Get the location from the currentEarthquake object and
        // set this text on the locationTextView
        locationTextView.setText(currentEarthquake.getLocation());

        // Find the TextView in the list_item.xml layout with the ID date
        TextView dateTextView = listItemView.findViewById(R.id.date);
        // Get the date from the currentEarthquake object and
        // set this text on the dateTextView
        dateTextView.setText(currentEarthquake.getDate());


        return listItemView;
    }
}
