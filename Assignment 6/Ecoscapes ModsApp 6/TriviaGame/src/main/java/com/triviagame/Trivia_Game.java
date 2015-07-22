package com.triviagame;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

//Called when app is launched
public class Trivia_Game extends Activity implements OnClickListener {
	
	static int  categoryIdInMainMenu;		//category selected by player in main menu
	static int finalScore;					//final score for the session
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Sets buttons for different categories and their listeners

        View general_button = findViewById(R.id.general_button);
        general_button.setOnClickListener(this);        
        
    }
    
    //Returns the categoryId selected in the main menu
    public static int getCategoryIdInMainMenu (){
    	return categoryIdInMainMenu;
    }
    
    
    //Listeners for the buttons with all the categories
    public void onClick(View v) {
    	
        switch (v.getId()) {
                
        //Geography category was selected

        //Science category was selected

        //General category was selected
        case R.id.general_button:
        	categoryIdInMainMenu = 6;
        	finalScore = 0;
            Intent g = new Intent(this, game.class);
            startActivity(g);
            break;    
   
        }
     }
    
    @Override
    protected void onResume(){
    	super.onResume();
    	music.play(this, R.raw.musicbackground);		//Play background music
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	music.stop(this);								//stop background music
    }
    
  
   
}