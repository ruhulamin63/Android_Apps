package com.example.alert_message_demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = this.<Button>findViewById(R.id.buttonId);
    }
    public void showMessage(View v){

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        // Setting Title
            alertDialogBuilder.setTitle(R.string.title_text);
        // Setting Icon
            alertDialogBuilder.setIcon(R.drawable.alert);
        // Setting Message
            alertDialogBuilder.setMessage(R.string.message_text);
         // Setting fixed message bar
            alertDialogBuilder.setCancelable(false);

         // Setting Positive Button
            alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
        // Setting Negative Button
            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
        // Setting Neutral Button
            alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"You have clicked on cancel ?",Toast.LENGTH_SHORT).show();
                }
            });

            // Create show alertDialog menue
            AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
    }
}
