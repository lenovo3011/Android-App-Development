package com.example.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner2);
        Button back = findViewById(R.id.back) ;
        Button home = findViewById(R.id.home) ;
        Button actv = findViewById(R.id.actv) ;
        android.widget.Spinner spinner = findViewById(R.id.spinner) ;



        ArrayList<String> array1 = new ArrayList<>() ;
        array1.add("Adhar Card") ;
        array1.add("Pan Card") ;
        array1.add ("Driving License") ;
        array1.add ("Rationing Card") ;
        array1.add("Light Bill") ;
        array1.add("Passport") ;

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, array1) ;
        spinner.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spinner.this, List.class ) ;
                startActivity(intent) ;
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spinner.this, MainActivity.class ) ;
                startActivity(intent) ;
            }
        });


        actv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spinner.this, Actv.class ) ;
                startActivity(intent) ;
            }
        });


    }
}