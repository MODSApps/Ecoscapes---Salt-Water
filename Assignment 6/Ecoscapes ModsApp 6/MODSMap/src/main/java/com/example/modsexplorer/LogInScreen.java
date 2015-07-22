package com.example.modsexplorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.modsexplorer.R;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

/**
 * The log in screen of the application.
 * 
 * @author Kyle Martinez
 * @version 6/25/2014
 */
public class LogInScreen extends ActionBarActivity {
	
	// View object references
	private Button submitButton;
	private EditText usernameForm, passwordForm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginscreen);	
		
		// Setup View object references
		submitButton = (Button) findViewById(R.id.loginscreen_submit_button);
		usernameForm = (EditText) findViewById(R.id.loginscreen_username_form);
		passwordForm = (EditText) findViewById(R.id.loginscreen_password_form);
		
		usernameForm.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void afterTextChanged(Editable s) { }

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				
				String usernameFormText = s.toString(); 
				
				if (usernameFormText.isEmpty())
					usernameForm.setError(getResources().getString(R.string.error_empty_string));
				else if (usernameFormText.contains(" "))
					usernameForm.setError(getResources().getString(R.string.error_contains_whitespace));
				else
					usernameForm.setError(null);
			}
		});

		passwordForm.addTextChangedListener(new TextWatcher() {
		
			@Override
			public void afterTextChanged(Editable s) {
				
				String passwordFormText = s.toString(); 
				
				if (passwordFormText.isEmpty())
					passwordForm.setError(getResources().getString(R.string.error_empty_string));
				else if (passwordFormText.contains(" "))
					passwordForm.setError(getResources().getString(R.string.error_contains_whitespace));
				else
					passwordForm.setError(null);
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) { }
		});
		
		submitButton.setOnClickListener(new OnClickListener() {
			
			@Override 
			public void onClick(View view) {
				
				if (usernameForm.getError() == null && passwordForm.getError() == null && !usernameForm.getText().toString().isEmpty()) {
					
					submitButton.setEnabled(false);
					
					Toast.makeText(LogInScreen.this, getResources().getString(R.string.process_database), Toast.LENGTH_SHORT).show();
					
					ParseUser.logInInBackground(usernameForm.getText().toString(), passwordForm.getText().toString(), new LogInCallback() {
						
						@Override
						public void done(ParseUser user, ParseException e) {
							
							if (user != null) {
								
								String frmtLogInSuccess = String.format(getResources().getString(R.string.success_log_in), usernameForm.getText().toString());
								Toast.makeText(getApplicationContext(), frmtLogInSuccess, Toast.LENGTH_LONG).show();
								
			                    Intent i = new Intent(LogInScreen.this, MainMenuScreen.class);
			                    startActivity(i);
			                    finish();         
							} else {
								
			                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_account_not_found), Toast.LENGTH_LONG).show();
			                }
							
							submitButton.setEnabled(true);
						}
					});
				} else {
					
					Toast.makeText(LogInScreen.this, getResources().getString(R.string.error_info_has_errors), Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
