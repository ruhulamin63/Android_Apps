package com.example.countryprofileproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bdButton,indiaButton,usaButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdButton = this.<Button>findViewById(R.id.bdButton);
        indiaButton = this.<Button>findViewById(R.id.indiaButton);
        usaButton = this.<Button>findViewById(R.id.usaButton);
    }

    public void onClickButton(View v){
        if(v.getId() == R.id.bdButton){
            intent = new Intent(MainActivity.this,ProfileCountry.class);
                intent.putExtra("name","bangladesh");
                startActivity(intent);
        }
        else if(v.getId() == R.id.indiaButton){
            intent = new Intent(MainActivity.this,ProfileCountry.class);
                intent.putExtra("name","india");
                startActivity(intent);
        }
        else if(v.getId() == R.id.usaButton){
            intent = new Intent(MainActivity.this,ProfileCountry.class);
                intent.putExtra("name","usa");
                startActivity(intent);
        }
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