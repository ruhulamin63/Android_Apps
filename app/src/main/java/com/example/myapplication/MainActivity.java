package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        /*
        Handler handler = new Handler();
       loginButt.setOnClickListener(handler);
       logoutButt.setOnClickListener(handler);
       }
        public class Handler implements View.OnClickListener {

            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.loginButtId){
                    loginText.setText("Login button is clicked");
                }
                else if(view.getId() == R.id.logoutButtId){
                    loginText.setText("Logout button is clicked now");
                }
            }
        }
        */

    public void showMessage(View v){
        if(v.getId() == R.id.loginButtId){
            loginText.setText("Login button is clicked");
        }
        else if(v.getId() == R.id.logoutButtId){
            loginText.setText("Logout button is clicked now");
        }
    }
}
