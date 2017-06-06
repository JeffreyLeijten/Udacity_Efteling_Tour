package com.example.android.eftelingtour;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
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
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        Attraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentAttraction.getName());

        TextView areaTextView = (TextView) listItemView.findViewById(R.id.area_text_view);
        areaTextView.setText(currentAttraction.getArea());

        TextView lengthTextView = (TextView) listItemView.findViewById(R.id.length_text_view);
        if (currentAttraction.getMinimumLength() != -1 || currentAttraction.getSupervisionLength() != -1){
            lengthTextView.setVisibility(View.VISIBLE);
            lengthTextView.setText(lengthStringBuilder(currentAttraction));
        } else {
            lengthTextView.setVisibility(View.GONE);
        }

        TextView descriptionTextView = (TextView) listItemView.findViewById(
                R.id.description_text_view);
        descriptionTextView.setText(currentAttraction.getDescription());

        ImageView AttractionImageView = (ImageView) listItemView.findViewById((
                R.id.attraction_image_view));
        AttractionImageView.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }

    private String lengthStringBuilder(Attraction currentAtraction){
        StringBuilder sb = new StringBuilder();
        Log.d("variables", "check");
        DecimalFormat df = new DecimalFormat("#.00");
        if (currentAtraction.getMinimumLength() != -1){
            sb.append("Minimum length: " + df.format(currentAtraction.getMinimumLength()/100.0)
                    + "m\n");
        }
        if (currentAtraction.getSupervisionLength() != -1){
            sb.append("Kids <" + df.format(currentAtraction.getSupervisionLength()/100.0)
                    + "m under supervison");
        }
        return sb.toString();
    }
}
