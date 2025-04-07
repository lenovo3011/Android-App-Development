package com.example.recyclerview;

import static android.widget.Toast.LENGTH_SHORT;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerContactAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button addcontact  = findViewById(R.id.addcontact) ;
        RecyclerView rv = findViewById(R.id.recyclerContact) ;
        rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList <ContactModel> contacts = new ArrayList<>() ;
        //ContactModel c1 = new ContactModel(R.drawable.baseline_account_box_24 , "Rutvi Raj" , "8208180805") ;
       // contacts.add(c1) ;
        for (int i = 0 ; i < 50; i ++){

            contacts.add(new ContactModel(R.drawable.baseline_account_box_24, "Rutvi Raj", "+91 82081 80805", (contacts.size() + 1 + "")));
            contacts.add(new ContactModel(R.drawable.baseline_account_box_24, "Raj Parsharam", "+91 82081 80805", (contacts.size() + 1 + "")));
        }


         adapter = new RecyclerContactAdapter(this, contacts) ;
        rv.setAdapter(adapter);


        addcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog d1 = new Dialog(MainActivity.this) ;
                d1.setContentView(R.layout.addcontact);
                EditText name , number ;
                Button btn ;
                name = d1.findViewById(R.id.name);
                number = d1.findViewById(R.id.number) ;
                btn = d1.findViewById(R.id.save);
                d1.show();

               btn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       String name1 = name.getText().toString() ;
                       String number1 = number.getText().toString();
                       if (!name1.isEmpty() && ! number1.isEmpty()) {
                           contacts.add(new ContactModel(R.drawable.baseline_account_box_24, name1, number1, contacts.size() + 1 +""));;
                           adapter.notifyItemInserted(contacts.size()-1);
                           rv.scrollToPosition(contacts.size()-1);
                          d1.dismiss();
                           Toast.makeText(MainActivity.this , "Contact Saved" , LENGTH_SHORT).show();

                       } else Toast.makeText(MainActivity.this , "Missing inputs" , LENGTH_SHORT).show();

                      // d1.dismiss();


                   }
               });
               //d1.dismiss();


            }
        });















    }}
