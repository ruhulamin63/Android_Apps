package com.example.customadepterdemo;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdepter extends BaseAdapter {

    int[] flags;
    String[] countryNames;
    String[] countryDescription;
    MainActivity mainActivity;
    private LayoutInflater inflater; // Convert layout and return view

    // create contractor method
    public CustomAdepter(MainActivity mainActivity, String[] countryNames, int[] flags, String[] countryDescription) {

        this.mainActivity = mainActivity;
        this.countryNames = countryNames;
        this.flags = flags;
        this.countryDescription = countryDescription;
    }

    @Override
    public int getCount() {
        // return all string names
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ServiceCast")
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            // Converting layout and input view
            inflater = (LayoutInflater) mainActivity.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE); // convert layout and import the view
            view = inflater.inflate(R.layout.sample_view, viewGroup, false); // return view
        }
        ImageView imageView = view.findViewById(R.id.imageId);
        TextView textView = view.findViewById(R.id.countryNameId);
        TextView textView1 = view.findViewById(R.id.countryDescriptionId);

        imageView.setImageResource(flags[i]); // i means position
            textView.setText(countryNames[i]);
            textView1.setText(countryDescription[i]);

        return view;
    }
}
