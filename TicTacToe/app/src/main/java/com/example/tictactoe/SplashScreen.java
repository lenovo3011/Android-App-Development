package com.example.tictactoe;

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

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView t1 = findViewById(R.id.t1) ;
        Animation move = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.opacity) ;
        t1.startAnimation(move);
        Intent intent = new Intent(SplashScreen.this , MainActivity.class) ;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);

                finish() ;
            }
        } , 4000) ;

    }
}