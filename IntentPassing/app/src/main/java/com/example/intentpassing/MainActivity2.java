package com.example.intentpassing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = findViewById(R.id.back);
        Intent fromAct = getIntent();

        String title = fromAct.getStringExtra("title");
        String rollno = fromAct.getStringExtra("rollno");  // Fixed: Use getStringExtra
        String sname = fromAct.getStringExtra("sname");

        TextView t2 = findViewById(R.id.t2);
        t2.setText("Roll No: " + rollno + ", Name: " + sname);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        // Add back button functionality
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity.class) ;
                startActivity(intent1);
            }
        });
    }
}
