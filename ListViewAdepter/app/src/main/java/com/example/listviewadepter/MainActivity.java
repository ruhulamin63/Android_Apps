package com.example.listviewadepter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdepter adapter;

    String[] title;
    String[] description;
    int[] icon = { R.drawable.bd_flag,R.drawable.india_flag,R.drawable.usa_flag, R.drawable.china_flag,
              R.drawable.brazil_flag, R.drawable.canada_flag, R.drawable.pakistan_flag };

    String[] locationName;
    int[] locationImages = {R.drawable.lalbag_kella, R.drawable.tajmahal_icon, R.drawable.dog,
            R.drawable.chiness_rice,R.drawable.brazilian_soccer,R.drawable.canada,R.drawable.pakistan_islamabad };

    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Items List");

        listView = findViewById(R.id.listView);

        // get countryName & countryDescription
        title = getResources().getStringArray(R.array.country_names);
        description = getResources().getStringArray(R.array.country_details_text);

        // get string country location details
        locationName = getResources().getStringArray(R.array.country_location_details);


        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdepter(this, arrayList);
            //bind the adapter to the listView
            listView.setAdapter(adapter);


            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getApplicationContext(),NewActivity.class);
                    intent.putExtra("image",locationImages[i]);
                    intent.putExtra("name",locationName[i]);
                    startActivity(intent);
                }
            });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //build inflate menu item
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
