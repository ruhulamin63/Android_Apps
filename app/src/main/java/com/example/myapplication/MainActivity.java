package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButt,logoutButt;
    private TextView loginText,logoutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButt = this.<Button>findViewById(R.id.loginButtId);
        logoutButt = this.<Button>findViewById(R.id.logoutButtId);

        loginText = this.<TextView>findViewById(R.id.LoginTextId);

    }

    public void showMessage(View v){
        if(v.getId() == R.id.loginButtId){

            Toast toast = Toast.makeText(MainActivity.this,"Login button is clicked",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
        }
        else if(v.getId() == R.id.logoutButtId){

            Toast toast = Toast.makeText(MainActivity.this,"Logout button is clicked",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }
    }
}
