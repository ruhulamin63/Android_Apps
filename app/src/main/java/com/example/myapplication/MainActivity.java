package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button addButt,subButt;
    private TextView result;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editText1 = this.<EditText>findViewById(R.id.editeText1Id);
            editText2 = this.<EditText>findViewById(R.id.editeText2Id);

            addButt = this.<Button>findViewById(R.id.addButtId);
            subButt = this.<Button>findViewById(R.id.subButtId);

            result = this.<TextView>findViewById(R.id.resultId);

        }
        public void showMessage(View v){

            try
            {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                //Converting int double
                Double num_1 = Double.parseDouble(num1);
                Double num_2 = Double.parseDouble(num2);

                if(v.getId() == R.id.addButtId){
                    Double sum = num_1 + num_2;
                    result.setText("Result : " +sum);
                }
                else if(v.getId() == R.id.subButtId){
                    Double sub = num_1 - num_2;
                    result.setText("Result : " +sub);
                }
                else if(v.getId() == R.id.mulButtId){
                    Double mul = num_1 * num_2;
                    result.setText("Result : " +mul);
                }
                else if(v.getId() == R.id.divButtId){
                    Double div = num_1 / num_2;
                    result.setText("Result : " +div);
                }
            }catch (Exception e){
                Toast.makeText(MainActivity.this,"Please enter your number",Toast.LENGTH_SHORT).show();
            }
        }
    }