package org.example.ecoscapes;


import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;

//import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;

import org.example.ecoscapes.R;


/**
 * Created by Roelle on 7/15/2015.
 */
public class BehindTheScenes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behindthescenes);

        final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.samplevid); //do not add any extension
        videoView.setVideoURI(video);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });


    }
}