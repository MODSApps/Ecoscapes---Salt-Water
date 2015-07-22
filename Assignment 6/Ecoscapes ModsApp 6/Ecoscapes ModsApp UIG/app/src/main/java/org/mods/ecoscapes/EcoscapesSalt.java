/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
***/
package org.example.sudoku;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;


public class EcoscapesSalt extends Activity implements OnClickListener {
   private static final String TAG = "EcoscapesSalt";

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      // Set up click listeners for all the buttons
      View continueButton = findViewById(R.id.games_button);
      continueButton.setOnClickListener(this);
      View newButton = findViewById(R.id.information_button);
      newButton.setOnClickListener(this);
      View btsButton = findViewById(R.id.bts_button);
      btsButton.setOnClickListener(this);
      View exitButton = findViewById(R.id.exit_button);
      exitButton.setOnClickListener(this);
       View aboutButton = findViewById(R.id.about_button);
       aboutButton.setOnClickListener(this);

   }


   // ...
   
   public void onClick(View v) {
      switch (v.getId()) {

          case R.id.information_button:
              Log.d(TAG,"clicked on Saltwater Sidekicks");
              startActivity(new Intent(this, Categories.class));
              break;
          case R.id.games_button:
              Log.d(TAG,"clicked on Games");
              break;
          case R.id.bts_button:
              Log.d(TAG,"clicked on Behind The Scenes");
              startActivity(new Intent(this, BehindTheScenes.class));
              break;
          case R.id.about_button:
              startActivity(new Intent(this, InformationActivity.class));
              Log.d(TAG,"clicked on About");
              break;
          case R.id.exit_button:
              Log.d(TAG,"clicked on Exit");
              finish();
              break;
      }}
    protected void onSaveInstanceState(Bundle outState)
    { super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
        final EditText textBox = (EditText) findViewById(R.id.username);
        CharSequence userText = textBox.getText();
        outState.putCharSequence("savedText", userText);
    }
    @Override protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
        final EditText textBox = (EditText) findViewById(R.id.username);
        CharSequence userText = savedInstanceState.getCharSequence("savedText");
        textBox.setText(userText);

    }


   /** @Override
   public boolean onCreateOptionsMenu(Menu menu) {
       super.onCreateOptionsMenu(menu);
       MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.menu, menu);
      return true;
   }
   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()) {
      case R.id.settings:
         startActivity(new Intent(this, Prefs.class));
         return true;
      // More items go here (if any) ...
      }
      return false;
   }

   /** Ask the user what difficulty level they want */
   private void openNewGameDialog() {
      new AlertDialog.Builder(this)
           .setTitle(R.string.new_game_title)
           .setItems(R.array.difficulty,
            new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialoginterface,
                     int i) {
                  startGame(i);
               }
            })
           .show();
   }
   
   /** Start a new game with the given difficulty level */
   private void startGame(int i) {
      Log.d(TAG, "clicked on " + i);
      // Start game here...
   }
}




