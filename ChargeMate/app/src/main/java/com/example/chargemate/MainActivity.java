package com.example.chargemate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView slide = findViewById(R.id.slide) ;
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate) ;
        slide.startAnimation(animation);
        Intent intent = new Intent(MainActivity.this , MainActivity2.class) ;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);

                finish() ;
            }
        } , 5000) ;


    }
}