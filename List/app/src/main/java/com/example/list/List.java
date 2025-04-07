package com.example.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ListView list = findViewById(R.id.listview) ;
        Button home = findViewById(R.id.home) ;
        Button spinner = findViewById(R.id.spinner) ;

        ArrayList<String> a1 = new ArrayList<> () ;
        a1.add("Upper Depot") ;
        a1.add("Upper Indira Nagar") ;
        a1.add("VIT") ;
        a1.add("SBI Colony") ;
        a1.add("Chintamany Nagar") ;
        a1.add("Lower Indira Nagar") ;
        a1.add("Bhartjyoti") ;
        a1.add("Bibwewadi") ;
        a1.add("Kothari") ;
        a1.add("Vasangbaug") ;
        a1.add("ESI Hospital") ;
        a1.add("Pushpmangal") ;
        a1.add("Bhapkar Petrol Pump") ;
        a1.add("S.T.Colony") ;
        a1.add("Laxminarayan") ;
        a1.add("Swargate") ;
        a1.add("Upper Depot") ;
        a1.add("Upper Indira Nagar") ;
        a1.add("VIT") ;
        a1.add("SBI Colony") ;
        a1.add("Chintamany Nagar") ;
        a1.add("Lower Indira Nagar") ;
        a1.add("Bhartjyoti") ;
        a1.add("Bibwewadi") ;
        a1.add("Kothari") ;
        a1.add("Vasangbaug") ;
        a1.add("ESI Hospital") ;
        a1.add("Pushpmangal") ;
        a1.add("Bhapkar Petrol Pump") ;
        a1.add("S.T.Colony") ;
        a1.add("Laxminarayan") ;
        a1.add("Swargate") ;
        a1.add("Upper Depot") ;
        a1.add("Upper Indira Nagar") ;
        a1.add("VIT") ;
        a1.add("SBI Colony") ;
        a1.add("Chintamany Nagar") ;
        a1.add("Lower Indira Nagar") ;
        a1.add("Bhartjyoti") ;
        a1.add("Bibwewadi") ;
        a1.add("Kothari") ;
        a1.add("Vasangbaug") ;
        a1.add("ESI Hospital") ;
        a1.add("Pushpmangal") ;
        a1.add("Bhapkar Petrol Pump") ;
        a1.add("S.T.Colony") ;
        a1.add("Laxminarayan") ;
        a1.add("Swargate") ;
        a1.add("Upper Depot") ;
        a1.add("Upper Indira Nagar") ;
        a1.add("VIT") ;
        a1.add("SBI Colony") ;
        a1.add("Chintamany Nagar") ;
        a1.add("Lower Indira Nagar") ;
        a1.add("Bhartjyoti") ;
        a1.add("Bibwewadi") ;
        a1.add("Kothari") ;
        a1.add("Vasangbaug") ;
        a1.add("ESI Hospital") ;
        a1.add("Pushpmangal") ;
        a1.add("Bhapkar Petrol Pump") ;
        a1.add("S.T.Colony") ;
        a1.add("Laxminarayan") ;
        a1.add("Swargate") ;

       ArrayAdapter <String> adapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1 , a1) ;
       list.setAdapter(adapter);

       home.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent1 = new Intent(List.this , MainActivity.class) ;
               startActivity(intent1) ;
           }
       });

        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(List.this , Spinner.class) ;
                startActivity(intent1) ;

            }
        });



    }
}