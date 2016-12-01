package com.felight.toastactivity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer mPlayer;
    boolean playing = false;
    Button btnPlay;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);


        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                mPlayer = MediaPlayer.create(getApplicationContext(),R.raw.chipmunks);//Create MediaPlayer object with MP3 file under res/raw folder
                mPlayer.start();//Start playing the music
            }
        });

        btnStop = (Button) findViewById(R.id.btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(mPlayer!=null && mPlayer.isPlaying()){//If music is playing already
                    mPlayer.stop();//Stop playing the music
                }
            }
        });
    }
}
