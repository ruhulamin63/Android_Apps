package com.example.customadepterdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
    private String[] countryDescription;

    private int[] flags = { R.drawable.bd_flag,R.drawable.india_flag,R.drawable.usa_flag, R.drawable.china_flag,
                            R.drawable.brazil_flag, R.drawable.canada_flag, R.drawable.pakistan_flag };

    private String[] locationName;
    private int[] locationImages = {R.drawable.lalbag_kella, R.drawable.tajmahal_icon, R.drawable.dog,
            R.drawable.chiness_rice,R.drawable.brazilian_soccer,R.drawable.canada,R.drawable.pakistan_islamabad };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        // get countryName & countryDescription
        countryNames = getResources().getStringArray(R.array.country_names);
        countryDescription = getResources().getStringArray(R.array.country_details_text);

         locationName = getResources().getStringArray(R.array.country_location_details);

        CustomAdepter adepter = new CustomAdepter(MainActivity.this,countryNames,flags,countryDescription);
            listView.setAdapter(adepter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = countryNames[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),DescriptionDetails.class);
                    intent.putExtra("image",locationImages[i]);
                    intent.putExtra("name",locationName[i]);
                    startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle(R.string.alert_title);
        alertDialogBuilder.setMessage(R.string.alert_message);
        alertDialogBuilder.setIcon(R.drawable.alert);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}