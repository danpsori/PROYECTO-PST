package com.example.proyectopst;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class MainActivity8 extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    List<String> seleccion = new ArrayList<>();
    String str="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        editText=(EditText)findViewById(R.id.editText);
        textView =(TextView)findViewById(R.id.textView18);
    }

    public void agregar(View v) {
        String comen = editText.getText().toString();
        seleccion.add(comen);
        editText.setText("");
        for (String comentario : seleccion) {
            str+= comentario+"\n";
        }
        textView.setText(str);
        str="";
    }
    public void desComentario(View view){
        RateUsDialog rateUsDialog = new RateUsDialog(MainActivity8.this);
        rateUsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        rateUsDialog.setCancelable(false);
        rateUsDialog.show();


    }
    public void verValor(View v){
        EditText campoTexto = (EditText) findViewById(R.id.editTextTextPersonName2);
        Log.d("Comentario:", campoTexto.getText().toString());
    }

}