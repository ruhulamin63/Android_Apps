package com.example.customadepterdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
    private String[] countryDescription;
    private int[] flags = { R.drawable.bd_flag,R.drawable.india_flag,R.drawable.usa_flag,
                            R.drawable.afghanistan_flag,R.drawable.china_flag,R.drawable.algeria_flag,
                            R.drawable.brazil_flag,R.drawable.angola_flag,R.drawable.canada_flag,
                            R.drawable.belgium_flag,R.drawable.pakistan_flag,R.drawable.portugal_flag,R.drawable.peru_flag
                          };

    String[] locationName;
    int[] locationImages = new int[]{R.drawable.lalbag_kella, R.drawable.tajmahal_icon, R.drawable.space_icon};
    private Intent intent;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        countryNames = getResources().getStringArray(R.array.country_names);
        countryDescription = getResources().getStringArray(R.array.country_details_text);

        locationName = getResources().getStringArray(R.array.description_text);

        CustomAdepter adepter = new CustomAdepter(MainActivity.this,countryNames,flags,countryDescription);
            listView.setAdapter(adepter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = countryNames[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),CountryDetails.class);
                    intent.putExtra("name",locationName[i]);
                    intent.putExtra("name",locationImages[i]);
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