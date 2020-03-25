package com.example.onactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = this.<Button>findViewById(R.id.button2Id);
        editText = this.<EditText>findViewById(R.id.editTextId);
    }
    public void showOnClickButton2(View v){
        String value = editText.getText().toString();

        Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            intent.putExtra("key",value);

            setResult(1,intent);
            finish();
    }
}
