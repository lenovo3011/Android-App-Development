package com.example.alertdialog;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertdialog = new AlertDialog.Builder(MainActivity.this).create() ;
                alertdialog.setTitle("Confirmation !");
                alertdialog.setMessage("Are you sure want to continue?");
                alertdialog.setButton(DialogInterface.BUTTON_POSITIVE,
                        "Yes, I agree !" , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this , "You can continue!", Toast.LENGTH_LONG).show();
                    }
                });
                alertdialog.show();
            }
        });

    }
}