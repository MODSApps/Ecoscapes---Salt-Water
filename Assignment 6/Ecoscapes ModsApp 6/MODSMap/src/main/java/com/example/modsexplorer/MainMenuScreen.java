package com.example.modsexplorer;

import com.parse.Parse;
import com.parse.ParseUser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainMenuScreen extends ActionBarActivity {

	// View object references
	private Button mapButton, scheduleButton, nfcButton, logOutButton, stickersButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainmenu);
		
		Parse.initialize(this, ParseKeys.APPLICATION_ID, ParseKeys.CLIENT_KEY);
		
		// Setup mapButton
		mapButton = (Button) findViewById(R.id.mainmenu_map_button);
		mapButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(MainMenuScreen.this, MODSExplorerMap.class);
				startActivity(i);
			}
		});
		
		// Setup scheduleButton
		scheduleButton = (Button) findViewById(R.id.mainmenu_schedule_button);
		scheduleButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(MainMenuScreen.this, Schedule.class);
				startActivity(i);
			}
		});
		
		// Setup nfcButton
		nfcButton = (Button) findViewById(R.id.mainmenu_nfc_button);
		nfcButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(MainMenuScreen.this, NFCMODSREAD.class);
				startActivity(i);
			}
		});
		
		// Setup stickersButton
		stickersButton = (Button) findViewById(R.id.mainmenu_stickers_button);
		stickersButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(MainMenuScreen.this, MODSExplorerStickers.class);
				startActivity(i);
			}
		});
		
		// Setup logOutButton
		logOutButton = (Button) findViewById(R.id.mainmenu_log_out_button);
		logOutButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				logOutParseUser();
				
				Intent i = new Intent(MainMenuScreen.this, WelcomeScreen.class);
				startActivity(i);
				finish();
			}
		});
	}
	
	public void logOutParseUser() {
			
		String currentUsername = ParseUser.getCurrentUser().getUsername();
		
		ParseUser.logOut();
		
		if (ParseUser.getCurrentUser() == null) {
			String frmtGoodbye = String.format(getResources().getString(R.string.success_log_out), currentUsername);
			Toast.makeText(MainMenuScreen.this, frmtGoodbye, Toast.LENGTH_LONG).show();
		} else {
			// Something went wrong...
		}
		
		finish();
	}
	
	@Override
	public void onBackPressed() {
		
		super.onBackPressed();
		logOutParseUser();
	}
}
