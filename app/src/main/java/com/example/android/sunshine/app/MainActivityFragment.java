package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecastArray= {"Today - Sunny - 88/63",
                                 "Tomorrow - Forggy - 70/46",
                                 "Weds - Cloudy - 72/63",
                                 "Thurs - Rainy - 64/51",
                                 "Fri - Foggy - 79/46",
                                 "Sat - Sunny - 76/68"};

        ArrayList<String> weekForecat = new ArrayList<String>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<String>(
                //The current context  (this fragment parent activity)
                getActivity(),
                //ID of list item layout
                R.layout.list_item_forecast,
                //ID of textview to populate
                R.id.list_item_forecast_textview,
                //Forecast data
                weekForecat);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
