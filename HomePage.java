package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class HomePage extends ActionBarActivity {
	public static String username="";
	public static String password="";
	public static String name="";
	public static String email="";
	public static String phone="";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exc5);
		((TextView)findViewById(R.id.textView1)).setText("Welcome "+name);
	}
	public void editProf(View v)
	{
		startActivity(new Intent(this, EditProfile.class));
	}



}
