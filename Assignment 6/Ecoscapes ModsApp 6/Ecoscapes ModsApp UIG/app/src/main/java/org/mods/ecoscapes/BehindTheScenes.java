package org.example.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;





/**
 * Created by Roelle on 7/15/2015.
 */
public class BehindTheScenes extends Activity implements OnClickListener {

    private static final String TAG = "BTS";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behindthescenes);
        // Set up click listeners for all the buttons
        View oneVid = findViewById(R.id.button);
        oneVid.setOnClickListener(this);
        View twoVid = findViewById(R.id.button2);
        twoVid.setOnClickListener(this);
        View threeVid = findViewById(R.id.button3);
        threeVid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Log.d(TAG, "clicked on first video");
                break;
            case R.id.button2:
                Log.d(TAG, "clicked on 2nd video");
            case R.id.button3:
                Log.d(TAG,"clicked on 3rd video");


        }
    }
}