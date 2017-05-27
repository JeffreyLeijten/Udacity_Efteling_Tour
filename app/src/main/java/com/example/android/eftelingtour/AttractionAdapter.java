package com.example.android.eftelingtour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 27-5-2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions){
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentAttraction.getName());

        ImageView AttractionImageView = (ImageView) listItemView.findViewById((R.id.attraction_image_view));
        AttractionImageView.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }
}
