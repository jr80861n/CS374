package com.example.conversionjoeriosv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CurrencyConverterActivity extends AppCompatActivity {

    Button button3;
    EditText editTextTextPersonName;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        button3 = findViewById(R.id.button3);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        textView3 = findViewById(R.id.textView3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextTextPersonName.getText().toString().isEmpty()){
                    editTextTextPersonName.setHint("Enter the amount");
                }else{
                    String s = editTextTextPersonName.getText().toString();
                    double i = Double.parseDouble(s);
                    double euros = i * 76;

                    textView3.setText(Integer.toString((int) euros));
                }
            }
        });




    }

}