package com.example.modsexplorer;

import java.util.HashMap;
import java.util.Map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignUpScreen extends ActionBarActivity 
{		
	// View object references
	private Button submitButton;
	private EditText usernameForm, passwordForm, emailForm;
	private Spinner ageList;
	
	@Override
	protected void onCreate(Bundle b) {

		super.onCreate(b);
		setContentView(R.layout.activity_signupscreen);

		// Setup View object references
		usernameForm = (EditText) findViewById(R.id.signupscreen_username_form);
		passwordForm = (EditText) findViewById(R.id.signupscreen_password_form);
		emailForm = (EditText) findViewById(R.id.signupscreen_email_form);
		submitButton = (Button) findViewById(R.id.signupscreen_submit_button);
		ageList = (Spinner) findViewById(R.id.signupscreen_age_spinner);
		
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

		emailForm.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void afterTextChanged(Editable s) {
				
				String emailFormText = s.toString(); 
				
				if (emailFormText.isEmpty())
					emailForm.setError(getResources().getString(R.string.error_empty_string));
				else if (emailFormText.contains(" "))
					emailForm.setError(getResources().getString(R.string.error_contains_whitespace));
				else
					emailForm.setError(null);
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) { }
		});
		
		submitButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if (usernameForm.getError() == null && passwordForm.getError() == null && emailForm.getError() == null 
					&& !usernameForm.getText().toString().isEmpty() && !passwordForm.getText().toString().isEmpty() 
					&& !emailForm.getText().toString().isEmpty()) {
				
					submitButton.setEnabled(false);
					
					// Create a new ParseUser
					ParseUser newUser = new ParseUser();
					newUser.setUsername(usernameForm.getText().toString());
					newUser.setPassword(passwordForm.getText().toString());
					newUser.setEmail(emailForm.getText().toString());
					newUser.put("ageGroup", ageList.getSelectedItem());
					
					// Setup user sticker collection
					Map<String, Boolean> stickerCollection = new HashMap<String, Boolean>();
					stickerCollection.put("prehistoric", false);
					stickerCollection.put("otter", false);
					stickerCollection.put("everglades", false);
					stickerCollection.put("goGreen", false);
					stickerCollection.put("powerfulYou", false);
					stickerCollection.put("ecoScapes", false);
					stickerCollection.put("aviationStation", false);
					stickerCollection.put("stormCenter", false);
					stickerCollection.put("waterStory", false);
					newUser.put("stickerCollection", stickerCollection);
					
					Toast.makeText(SignUpScreen.this, getResources().getString(R.string.process_database), Toast.LENGTH_SHORT).show();
					
					// Attempt to save newUser to Parse
					newUser.signUpInBackground(new SignUpCallback() {
						
						@Override
						public void done(ParseException e) {					
							
							if (e == null) {
								String frmtSuccessSignUp = String.format(getResources().getString(R.string.success_sign_up), usernameForm.getText().toString());
								Toast.makeText(SignUpScreen.this, frmtSuccessSignUp, Toast.LENGTH_LONG).show();
								
								Intent i = new Intent(SignUpScreen.this, WelcomeScreen.class);
								startActivity(i);
								finish();
							} else {
								switch(e.getCode()) {
									case ParseException.USERNAME_TAKEN:
										Toast.makeText(SignUpScreen.this, getResources().getString(R.string.error_parse_username_taken), Toast.LENGTH_LONG).show();
										break;
									case ParseException.INVALID_EMAIL_ADDRESS:
										Toast.makeText(SignUpScreen.this, getResources().getString(R.string.error_parse_invalid_email), Toast.LENGTH_LONG).show();
										break;
									default:
										String frmtParseGenericError = String.format(getResources().getString(R.string.error_parse_generic), e.getCode());
										Toast.makeText(SignUpScreen.this, frmtParseGenericError, Toast.LENGTH_LONG).show();
										break;		
								}
							}
						}
					});
				} else {
					
					Toast.makeText(SignUpScreen.this, getResources().getString(R.string.error_info_has_errors), Toast.LENGTH_LONG).show();
				}
				
				submitButton.setEnabled(true);
			}
		});
	}
}
