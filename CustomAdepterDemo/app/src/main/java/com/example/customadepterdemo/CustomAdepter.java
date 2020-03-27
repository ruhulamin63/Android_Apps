package com.example.customadepterdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdepter extends BaseAdapter {

    private int[] flags;
    private String[] countryNames;
    private String[] countryDescription;
    private MainActivity mainActivity;
    private LayoutInflater inflater; // Convert layout and return view

    // create contractor and show MainActivity
    public CustomAdepter(MainActivity mainActivity, String[] countryNames, int[] flags, String[] countryDescription) {

        this.mainActivity = mainActivity;
        this.countryNames = countryNames;
        this.flags = flags;
        this.countryDescription = countryDescription;
    }

    @Override
    public int getCount() {
        return countryNames.length; //Using flag or countryNames
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {

            inflater = (LayoutInflater) mainActivity.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE); // convert layout and import the view
            view = inflater.inflate(R.layout.sample_view, viewGroup, false); // return view
        }

        //getting view in row_data
        TextView name = view.findViewById(R.id.countryNameId);
        TextView name1 = view.findViewById(R.id.countryDescriptionId);
        ImageView image = view.findViewById(R.id.imageId);

        name.setText(countryNames[i]);
        name1.setText(countryDescription[i]);
        image.setImageResource(flags[i]);

        return view;
    }
}