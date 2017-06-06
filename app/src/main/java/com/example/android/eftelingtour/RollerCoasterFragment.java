package com.example.android.eftelingtour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 29-5-2017.
 */

public class RollerCoasterFragment extends android.support.v4.app.Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(0);
        attractions.add(new Attraction(getString(R.string.baron_1898), getString(R.string.ruigrijk),
                140, -1, getString(R.string.baron_1898_description), R.drawable.baron_1898));
        attractions.add(new Attraction(getString(R.string.bob), getString(R.string.anderrijk),
                -1, 120, getString(R.string.bob_description), R.drawable.bob));
        attractions.add(new Attraction(getString(R.string.python), getString(R.string.ruigrijk),
                120, -1, getString(R.string.python_description), R.drawable.python));
        attractions.add(new Attraction(getString(R.string.vogel_rok), getString(R.string.reizenrijk),
                120, -1, getString(R.string.vogel_rok_description), R.drawable.vogel_rok));
        attractions.add(new Attraction(getString(R.string.de_vliegende_hollander), getString(R.string.ruigrijk),
                120, -1, getString(R.string.de_vliegende_hollander_description), R.drawable.de_vliegende_hollander));
        attractions.add(new Attraction(getString(R.string.joris_en_de_draak), getString(R.string.ruigrijk),
                110, 120, getString(R.string.joris_en_de_draak_description), R.drawable.joris_en_de_draak));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
