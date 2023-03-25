package com.example.conversionjoeriosv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
        button = findViewById(R.id.button3);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CurrencyConverterActivity.class);
            startActivity(intent);


        });


    }
}