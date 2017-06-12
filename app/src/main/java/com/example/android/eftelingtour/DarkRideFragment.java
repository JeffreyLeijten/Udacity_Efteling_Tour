package com.example.android.eftelingtour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DarkRideFragment extends android.support.v4.app.Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(0);
        attractions.add(new Attraction(getString(R.string.symbolica), getString(R.string.marerijk),
                -1, 100, getString(R.string.symbolica_description), R.drawable.symbolica));
        attractions.add(new Attraction(getString(R.string.droomvlucht), getString(R.string.marerijk),
                -1, 100, getString(R.string.droomvlucht_description), R.drawable.droomvlucht));
        attractions.add(new Attraction(getString(R.string.fata_morgana), getString(R.string.anderrijk),
                -1, 120, getString(R.string.fata_morgana_description), R.drawable.fata_morgana));
        attractions.add(new Attraction(getString(R.string.carnaval_festival), getString(R.string.reizenrijk),
                -1, 100, getString(R.string.carnaval_festival_description), R.drawable.carnaval_festival));
        attractions.add(new Attraction(getString(R.string.villa_volta), getString(R.string.marerijk),
                -1, 100, getString(R.string.villa_volta_description), R.drawable.villa_volta));
        attractions.add(new Attraction(getString(R.string.pandadroom), getString(R.string.anderrijk),
                -1, -1, getString(R.string.pandadroom_description), R.drawable.pandadroom));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
