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

    private String[] countryNames; /* = {"Bangladesh","India","USA","Afghanistan","China","Algeria",
            "Brazil","Angola","Canada","Belgium","Pakistan","Portugal","Peru"}; */

    private String[] countryDescription; /* = {"Bangladesh description","India description","USA description",
                                            "Afghanistan description","China description","Algeria description",
                                            "Brazil description","Angola description","Canada description",
                                            "Belgium description","Pakistan description","Portugal description","Peru description"}; */

    private int[] flags = { R.drawable.bd_flag,R.drawable.india_flag,R.drawable.usa_flag,
                            R.drawable.afghanistan_flag,R.drawable.china_flag,R.drawable.algeria_flag,
                            R.drawable.brazil_flag,R.drawable.angola_flag,R.drawable.canada_flag,
                            R.drawable.belgium_flag,R.drawable.pakistan_flag,R.drawable.portugal_flag,R.drawable.peru_flag
                          };

    //private LayoutInflater inflater;

    //private String[] locationName;
   // private int[] locationImages = new int[]{R.drawable.lalbag_kella, R.drawable.tajmahal_icon, R.drawable.space_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        // get countryName & countryDescription
        countryNames = getResources().getStringArray(R.array.country_names);
        countryDescription = getResources().getStringArray(R.array.country_details_text);

        //locationName = getResources().getStringArray(R.array.description_text);

        CustomAdepter adepter = new CustomAdepter(MainActivity.this,countryNames,flags,countryDescription);
            listView.setAdapter(adepter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = countryNames[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),DescriptionDetails.class);
                    intent.putExtra("name",countryNames[i]);
                   // intent.putExtra("name",countryDescription[i]);
                    intent.putExtra("image",flags[i]);
                    startActivity(intent);
            }
        });
    }

/*
    private class CustomAdepter extends BaseAdapter {
        @Override
        public int getCount() {
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

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if(view == null) {
                // Converting layout and input view
                inflater = (LayoutInflater) getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE); // convert layout and import the view
                view = inflater.inflate(R.layout.sample_view, viewGroup, false); // return view
            }

            // View view1 = getLayoutInflater().inflate(R.layout.sample_view,null);

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
 */


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