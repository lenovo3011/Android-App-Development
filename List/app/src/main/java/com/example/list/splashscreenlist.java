package com.example.list;

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

public class splashscreenlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splashscreenlist);

        TextView t1 = findViewById(R.id.t1) ;

        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        t1.startAnimation(anim);

        Intent intent1 = new Intent(this, MainActivity.class) ;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent1);

                finish() ;
            }
        } , 4000) ;

    }
}