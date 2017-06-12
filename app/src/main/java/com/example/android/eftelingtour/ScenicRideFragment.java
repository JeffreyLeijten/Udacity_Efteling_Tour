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
public class ScenicRideFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(0);
        attractions.add(new Attraction(getString(R.string.sprookjesbos), getString(R.string.marerijk),
                -1, -1, getString(R.string.sprookjesbos_description), R.drawable.sprookjesbos));
        attractions.add(new Attraction(getString(R.string.pagode), getString(R.string.reizenrijk),
                -1, 100, getString(R.string.pagode_description), R.drawable.pagode));
        attractions.add(new Attraction(getString(R.string.gondoletta), getString(R.string.reizenrijk),
                -1, 120, getString(R.string.gondoletta_description), R.drawable.gondoletta));
        attractions.add(new Attraction(getString(R.string.stoomtrein), getString(R.string.ruigrijk) + "/" + getString(R.string.marerijk),
                -1, 100, getString(R.string.stoomtrein_description), R.drawable.stoomtrein));
        attractions.add(new Attraction(getString(R.string.volk_van_laaf), getString(R.string.marerijk),
                -1, -1, getString(R.string.volk_van_laaf_description), R.drawable.volk_van_laaf));
        attractions.add(new Attraction(getString(R.string.oldtimerbaan), getString(R.string.ruigrijk),
                -1, 120, getString(R.string.oldtimerbaan_description), R.drawable.oldtimerbaan));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
