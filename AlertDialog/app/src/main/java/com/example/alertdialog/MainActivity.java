package com.example.alertdialog;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

import android.app.Dialog;
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
        Button button = findViewById(R.id.btnd) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertdialog = new AlertDialog.Builder(MainActivity.this).create() ;
                alertdialog.setTitle("Are you sure?");
                alertdialog.setMessage("Do you want to exit? ");
                alertdialog.setButton(DialogInterface.BUTTON_POSITIVE,
                        "Yes" , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                        //Toast.makeText(MainActivity.this , "You pressed Yes", Toast.LENGTH_LONG).show();
                    }
                });


                alertdialog.setButton(DialogInterface.BUTTON_NEGATIVE, "No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        Toast.makeText(MainActivity.this , "You pressed No" , Toast.LENGTH_LONG).show();
                    }
                });

                alertdialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this , "Operation cancelled" , Toast.LENGTH_LONG).show() ;
                    }
                });
                alertdialog.show();
            }
        });


        Button custome = findViewById(R.id.btnc) ;
        custome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Dialog dialog = new Dialog(MainActivity.this) ;
                 dialog.setCancelable(false);
                dialog.setContentView(R.layout.custome_alert_dialog);
                Button back = dialog.findViewById(R.id.back) ;
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       MainActivity.super.onBackPressed();
                    }
                });

                Button okay = dialog.findViewById(R.id.okay) ;
                okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Dialog Closed" , LENGTH_SHORT).show();
                        dialog.dismiss();

                    }
                });dialog.show() ;
            }
        });

    }
}