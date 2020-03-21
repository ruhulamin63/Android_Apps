package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.mycheckboxdemo.R.id.ButtonId;

public class MainActivity extends AppCompatActivity {

    private Button show;
    private CheckBox milkcheckBox,sugercheckbox,teacheckbox;
    private TextView ResultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = this.<Button>findViewById(R.id.ButtonId);
        milkcheckBox = this.<CheckBox>findViewById(R.id.MilkId);
        sugercheckbox = this.<CheckBox>findViewById(R.id.SugerId);
        teacheckbox = this.<CheckBox>findViewById(R.id.TeaId);
        ResultTextView = this.<TextView>findViewById(R.id.ResultTextViewId);
    }
    public void showMessage(View v){
        StringBuilder stringBuilder = new StringBuilder();
        if(milkcheckBox.isChecked()){
                String value = milkcheckBox.getText().toString();
                    stringBuilder.append(value + " is order " + "\n");
        }
        if(sugercheckbox.isChecked()){
            String value = sugercheckbox.getText().toString();
            stringBuilder.append(value + " is order " + "\n");
        }
        if(teacheckbox.isChecked()){
            String value = teacheckbox.getText().toString();
            stringBuilder.append(value +" is order " + "\n");
        }
        ResultTextView.setText(stringBuilder);
    }
}
