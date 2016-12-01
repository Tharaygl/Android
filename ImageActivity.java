package com.felight.toastactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hp on 19-10-2016.
 */

public class ImageActivity extends AppCompatActivity{
    private Button btnMove;
    private Button btnShake;
    private Button btnAlpha;
    private Button btnRotate;
    //private Button btnClick;

    Animation performRotate,performMove,performShake,performAlpha,performClick;
    ImageView imgView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageactivity_layout);

        performShake= AnimationUtils.loadAnimation(this,R.anim.shake);
        performShake.setRepeatCount(4);

        performMove= AnimationUtils.loadAnimation(this,R.anim.move);
        performMove.setRepeatCount(4);

        performRotate= AnimationUtils.loadAnimation(this,R.anim.rotate);
        performRotate.setRepeatCount(1);

        performAlpha= AnimationUtils.loadAnimation(this,R.anim.alpha);
        performAlpha.setRepeatCount(4);


        /*performClick= AnimationUtils.loadAnimation(this,R.anim.click);
        performClick.setRepeatCount(1);*/



        imgView=(ImageView)findViewById(R.id.imgView);
        btnMove=(Button)findViewById(R.id.btnMove);
        btnShake=(Button)findViewById(R.id.btnShake);
        btnAlpha=(Button)findViewById(R.id.btnAlpha);
        btnRotate=(Button)findViewById(R.id.btnRotate);
        //btnClick=(Button)findViewById(R.id.btnClick);

        btnShake.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                imgView.startAnimation(performShake);
            }

        });

        btnAlpha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imgView.startAnimation(performAlpha);
            }

        });

        btnRotate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imgView.startAnimation(performRotate);
            }

        });

       btnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imgView.startAnimation(performMove);
            }

        });

       /* btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imgView.startAnimation(performClick);

            }

        });*/


    }
}

