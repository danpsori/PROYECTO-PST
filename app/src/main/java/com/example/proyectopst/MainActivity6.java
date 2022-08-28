package com.example.proyectopst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity2.EXTRA_MESSAGE);
        textView = findViewById(R.id.textView28);
        textView.setText(message);

        String message2 = intent.getStringExtra(MainActivity3.EXTRA_MESSAGE);
        textView = findViewById(R.id.textView28);
        textView.setText(message2);

        String message3 = intent.getStringExtra(MainActivity4.EXTRA_MESSAGE);
        textView = findViewById(R.id.textView28);
        textView.setText(message3);

        String message4 = intent.getStringExtra(MainActivity5.EXTRA_MESSAGE);
        textView = findViewById(R.id.textView28);
        textView.setText(message4);
    }
}