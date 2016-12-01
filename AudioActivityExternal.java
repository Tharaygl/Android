package com.felight.toastactivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.Toast;


import java.io.IOException;

public class AudioActivityExternal extends AppCompatActivity {

    Button Play,Stop,Pause;
   MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_external);

        Play=(Button)findViewById(R.id.btnPlay);
        Pause=(Button)findViewById(R.id.btnPause);
        Stop=(Button)findViewById(R.id.btnStop);

        String filePath = Environment.getExternalStorageDirectory().getPath()+"C:/Thara/songs/Super/sikkapatte.mp3";
        mediaPlayer = new  MediaPlayer();

        try {
            mediaPlayer.setDataSource(filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

            }
        });

        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();

            }
        });

        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();

            }
        });
    //mediaPlayer.stop();




    }
}
