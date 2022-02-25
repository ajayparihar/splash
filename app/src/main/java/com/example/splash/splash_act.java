package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_act extends AppCompatActivity {
    Animation anim_img, anim_logo;
    ImageView img_bg, img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        anim_img= AnimationUtils.loadAnimation(this,R.anim.splash_appear);
        anim_logo= AnimationUtils.loadAnimation(this,R.anim.splash_2);
        img_bg=findViewById(R.id.yel_bg);
        img=findViewById(R.id.red);
        img.setAnimation(anim_logo);
        img_bg.setAnimation(anim_img);

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Intent i = new Intent(splash_act.this, MainActivity.class); startActivity(i);
                finish();
            }
            }
            , 2000);
    }
    }