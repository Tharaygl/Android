package com.felight.toastactivity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoOnline extends AppCompatActivity {

    VideoView vidView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_online);
        vidView = (VideoView)findViewById(R.id.myVideo);
        onPlay();
    }
    public void onPlay(){
        String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        vidView.start();
        //MediaController vidControl = new MediaController(null);
        //vidControl.setAnchorView(vidView);
        //vidView.setMediaController(vidControl);
    }
}
