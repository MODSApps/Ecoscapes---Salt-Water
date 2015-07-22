package org.example.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/**
 * Created by Roelle on 7/15/2015.
 */
public class Fish extends Activity implements OnClickListener {
    private static final String TAG = "Fish";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fish);
        // Set up click listeners for all the buttons
        View nextFish = findViewById(R.id.imagechange);
        nextFish.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.imagechange:
                Log.d(TAG, "clicked on Saltwater Sidekicks");
        }
    }
}
