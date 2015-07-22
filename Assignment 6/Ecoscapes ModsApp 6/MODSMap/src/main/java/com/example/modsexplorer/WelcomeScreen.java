package com.example.modsexplorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.parse.Parse;

public class WelcomeScreen extends ActionBarActivity {
	
	private Button logInButton, signUpButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcomescreen);
		
		Parse.initialize(this, ParseKeys.APPLICATION_ID, ParseKeys.CLIENT_KEY);
		
		// Setup signUpButton
		signUpButton = (Button) findViewById(R.id.sign_up_button);
		signUpButton.setOnClickListener(new OnClickListener() {	
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(WelcomeScreen.this, SignUpScreen.class);
				startActivity(i);
			}
		});
				
		// Setup logInButton
		logInButton = (Button) findViewById(R.id.log_in_button);
		logInButton.setOnClickListener(new OnClickListener() {	
			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(WelcomeScreen.this, LogInScreen.class);
				startActivity(i);
			}
		});
	}
}