package com.example.proyectopst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Burger(View view) {
        Intent i = new Intent(this, MainActivity2.class );
        startActivity(i);
    }
    public void Donalds(View view) {
        Intent i = new Intent(this, MainActivity3.class );
        startActivity(i);
    }
    public void KFC(View view) {
        Intent i = new Intent(this, MainActivity4.class );
        startActivity(i);
    }
    public void Pizza(View view) {
        Intent i = new Intent(this, MainActivity5.class );
        startActivity(i);
    }

    public void comentario(View view){
        Intent i = new Intent(this, MainActivity8.class );
        startActivity(i);
    }
    //prueba






}
