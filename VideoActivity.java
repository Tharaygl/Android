package com.felight.toastactivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


/**
 * Created by hp on 19-10-2016.
 */

public class VideoActivity extends AppCompatActivity{
    VideoView vView;
    Button btnClick;
    MediaController media;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videoactivity_layout);


        //btnClick=(Button)findViewById(R.id.btnClick);
        vView = (VideoView) findViewById(R.id.vView);
        playVideo();
    }
    public void playVideo(){
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.threadmill);
       // media=new MediaController(this);
        //vView.setMediaController(media);
        vView.setMediaController(null);
        vView .setVideoURI(uri);
        vView.start();


    }
    /*public void videoplay(View view){
        String videopath="android.resource://com.felight.toastactivity"+R.raw.abc;
        Uri uri= Uri.parse(videopath);
        vView.setVideoURI(uri);
        vView.start();

    }*/
}
