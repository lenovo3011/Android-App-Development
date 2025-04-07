package com.example.toolbar;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar) ;
        setSupportActionBar(toolbar);
        if (getSupportActionBar()!= null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My Toolbar");

        }
//        toolbar.setTitle("My Toolbar");
        toolbar.setSubtitle("Sub Title"); }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            new MenuInflater(this).inflate(R.menu.menu , menu);
            return super.onCreateOptionsMenu(menu) ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId() ;

        if (id==R.id.open) {
            Toast.makeText(this , "File Opened" , LENGTH_SHORT).show(); ;
        }
        else if (id==R.id.opt_new) {
            Toast.makeText(this, "New File" , LENGTH_SHORT).show();
        }
        else if (id==R.id.save) {
            Toast.makeText(this, "File Saved" , LENGTH_SHORT).show();
        }
        else {Toast.makeText(this, "Pressed back button" , LENGTH_SHORT).show(); }


        return super.onOptionsItemSelected(item);
    }
}
