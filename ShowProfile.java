package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShowProfile extends ActionBarActivity {
	public static String user="";
	public static String passw="";
	public static String mail="";
	public static String phon="";
	public static String name="";
	public static String bio="";
	public static String dob="";
	public static String gen="";
	public static String weight="";





	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.exc19);
		((TextView)findViewById(R.id.textView1)).setText(user);
		((TextView)findViewById(R.id.textView2)).setText(passw);
		((TextView)findViewById(R.id.textView3)).setText(name);
		((TextView)findViewById(R.id.textView4)).setText(mail);
		((TextView)findViewById(R.id.textView5)).setText(phon);
		((TextView)findViewById(R.id.textView6)).setText(bio);
		((TextView)findViewById(R.id.textView7)).setText(dob);
		((TextView)findViewById(R.id.textView8)).setText(gen);
		((TextView)findViewById(R.id.textView9)).setText(weight);

	}






}
