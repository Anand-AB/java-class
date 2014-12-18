package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditProfile extends ActionBarActivity {
	public static String user="";
	public static String passw="";
	public static String mail="";
	public static String phon="";
	public static String name="";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exc12);
		((TextView)findViewById(R.id.editText3)).setText(ThirdActivity.user);
		((TextView)findViewById(R.id.editText4)).setText(ThirdActivity.passw);
		((TextView)findViewById(R.id.editText1)).setText(ThirdActivity.name);
		((TextView)findViewById(R.id.editText2)).setText(ThirdActivity.mail);
		((TextView)findViewById(R.id.editText5)).setText(ThirdActivity.phon);
	}
	public void show(View v) {
		EditText user_name=(EditText)findViewById(R.id.editText3);
		HomePage.name=user;
		startActivity(new Intent(this, HomePage.class));
	}


}
