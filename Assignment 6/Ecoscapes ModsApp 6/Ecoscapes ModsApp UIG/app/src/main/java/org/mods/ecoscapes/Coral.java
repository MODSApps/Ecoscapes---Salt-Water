package org.example.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Roelle on 7/15/2015.
 */
public class Coral extends Activity implements View.OnClickListener {
    private static final String TAG = "Coral";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coral);
        // Set up click listeners for all the buttons
        View nextFish = findViewById(R.id.imagechange);
        nextFish.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.imagechange:
                Log.d(TAG, "clicked on next button");

        }
    }
}