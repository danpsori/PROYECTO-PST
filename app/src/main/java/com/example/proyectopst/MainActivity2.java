package com.example.proyectopst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    List<String> seleccion = new ArrayList<>();
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void registro1(View view){
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        seleccion.add(textView.getText().toString()+" "+textView2.getText().toString()+" "+textView3.getText().toString());
    }

    public void registro2(View view){
        TextView textView4= findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);
        seleccion.add(textView4.getText().toString()+" "+textView5.getText().toString()+" "+textView6.getText().toString());
    }

    public void registro3(View view){
        TextView textView7= findViewById(R.id.textView7);
        TextView textView8 = findViewById(R.id.textView8);
        TextView textView9 = findViewById(R.id.textView9);
        seleccion.add(textView7.getText().toString()+" "+textView8.getText().toString()+" "+textView9.getText().toString());
    }

    public void registro4(View view){
        TextView textView10= findViewById(R.id.textView10);
        TextView textView11 = findViewById(R.id.textView11);
        TextView textView12 = findViewById(R.id.textView12);
        seleccion.add(textView10.getText().toString()+" "+textView11.getText().toString()+" "+textView12.getText().toString());
    }

    public void registro5(View view){
        TextView textView13= findViewById(R.id.textView13);
        TextView textView14 = findViewById(R.id.textView14);
        TextView textView15= findViewById(R.id.textView15);
        seleccion.add(textView13.getText().toString()+" "+textView14.getText().toString()+" "+textView15.getText().toString());
    }

    public void Carrito(View view) {
        Intent i = new Intent(this, MainActivity6.class );
        for (String comida : seleccion) {
            str+= comida+"\n";
        }
        i.putExtra(EXTRA_MESSAGE,str);
        str="";
        startActivity(i);
    }

}