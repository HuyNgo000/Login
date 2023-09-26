package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.icu.text.MessagePattern;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import kotlin.Pair;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCRESS = 5000;

    //variables
    Animation topAnima, bottonAnima;
    ImageView image;
    TextView logo,slogon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animation
        topAnima = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnima = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        slogon = findViewById(R.id.textView2);

        image.setAnimation(topAnima);
        logo.setAnimation(bottonAnima);
        slogon.setAnimation(bottonAnima);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCRESS);
    }




}