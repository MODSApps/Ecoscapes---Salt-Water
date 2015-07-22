/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
 ***/
package org.example.ecoscapes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import org.example.ecoscapes.R;

public class Categories extends Activity implements OnClickListener {
    private static final String TAG = "Categories";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        // Set up click listeners for all the buttons
        View fishButton = findViewById(R.id.fish_button);
        fishButton.setOnClickListener(this);
        View invertebrateButton = findViewById(R.id.invertebrate_button);
        invertebrateButton.setOnClickListener(this);
        View coralButton = findViewById(R.id.coral_button);
        coralButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fish_button:
                Log.d(TAG, "clicked on fish");
                startActivity(new Intent(this, Fish.class));
                break;
            case R.id.invertebrate_button:
                Log.d(TAG, "clicked on invertebrate");
                startActivity(new Intent(this, Invertebrates.class));;
                break;
            case R.id.coral_button:
                Log.d(TAG, "clicked on coral");
                startActivity(new Intent(this,Coral.class));
                break;

        }
    }
}