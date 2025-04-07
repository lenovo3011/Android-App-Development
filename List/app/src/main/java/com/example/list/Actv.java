package com.example.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;

public class Actv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_actv);
        AutoCompleteTextView actv = findViewById(R.id.actv) ;
        Button home = findViewById(R.id.home) ;
        Button back = findViewById(R.id.back) ;

        String[] array = {
                "Java", "JavaScript", "Python", "C", "C++", "C#", "Swift", "Kotlin",
                "Ruby", "Go", "PHP", "Rust", "TypeScript", "Dart", "Perl", "Scala"
        };
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array) ;
        actv.setAdapter(adapter) ;
        actv.setThreshold(2);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Actv.this , MainActivity.class) ;
                startActivity(intent1) ;
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (Actv.this , Spinner.class) ;
                startActivity(intent2) ;
            }
        });

    }
}