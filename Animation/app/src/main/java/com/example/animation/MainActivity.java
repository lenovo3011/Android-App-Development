package com.example.animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button bt1, bt2,bt3,bt4 , bt5;
        TextView t1 ;
        LottieAnimationView l1  = findViewById(R.id.l1);

        bt1 = findViewById(R.id.rotate) ;
        bt2 = findViewById(R.id.alpha) ;
        bt3 = findViewById(R.id.scale) ;
        bt4 = findViewById(R.id.translate);
        bt5 = findViewById(R.id.lottie) ;
        t1 = findViewById(R.id.rutvi) ;


        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate) ;
        Animation alpha = AnimationUtils.loadAnimation(this, R.anim.alpha) ;
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale) ;
        Animation translate = AnimationUtils.loadAnimation(this, R.anim.translate) ;
        
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.startAnimation(rotate);
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.startAnimation(alpha);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.startAnimation(scale);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.startAnimation(translate);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              l1.setAnimation(R.raw.lottie);
              l1.playAnimation();
              l1.loop(true);
            }
        });






    }
}