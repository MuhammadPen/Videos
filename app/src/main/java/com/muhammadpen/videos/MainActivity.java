package com.muhammadpen.videos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView =  findViewById(R.id.videoView);

        videoView.setVideoPath("android.resources://" + getPackageName() + "/" + R.raw.leaves_video);

        MediaController videoController = new MediaController(this);

        videoController.setAnchorView(videoView);

        videoView.setMediaController(videoController);

        videoView.start();


    }
}
