package com.example.android.eftelingtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RollerCoasterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> attractions = new ArrayList<>(0);
        attractions.add(new Attraction("Baron 1898", R.drawable.baron_1898));
        attractions.add(new Attraction("Python", R.drawable.baron_1898));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
