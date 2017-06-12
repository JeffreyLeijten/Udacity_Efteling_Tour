package com.example.android.eftelingtour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ExcitingRideFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(0);
        attractions.add(new Attraction(getString(R.string.pirana), getString(R.string.anderrijk),
                -1, 120, getString(R.string.pirana_description), R.drawable.pirana));
        attractions.add(new Attraction(getString(R.string.halve_maen), getString(R.string.ruigrijk),
                -1, 120, getString(R.string.halve_maen_description), R.drawable.halve_maan));
        attractions.add(new Attraction(getString(R.string.monsieur_cannibale), getString(R.string.anderrijk),
                -1, 100, getString(R.string.monsieur_cannibale_description), R.drawable.monsieur_cannibale));
        attractions.add(new Attraction(getString(R.string.polka_marina), getString(R.string.ruigrijk),
                -1, 100, getString(R.string.polka_marina_description), R.drawable.polka_marina));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
