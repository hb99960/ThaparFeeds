package com.example.dam.thaparfeeds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
}
