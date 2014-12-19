package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EditProfile extends ActionBarActivity {
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
		setContentView(R.layout.exc12);
		((TextView)findViewById(R.id.editText3)).setText(ThirdActivity.user);
		((TextView)findViewById(R.id.editText4)).setText(ThirdActivity.passw);
		((TextView)findViewById(R.id.editText1)).setText(ThirdActivity.name);
		((TextView)findViewById(R.id.editText2)).setText(ThirdActivity.mail);
		((TextView)findViewById(R.id.editText5)).setText(ThirdActivity.phon);
	}
	public void show(View v) {
		EditText edit_user=(EditText)findViewById(R.id.editText3);
		EditText edit_pass=(EditText)findViewById(R.id.editText4);
		EditText edit_name=(EditText)findViewById(R.id.editText1);
		EditText edit_mail=(EditText)findViewById(R.id.editText2);
		EditText edit_phone=(EditText)findViewById(R.id.editText5);
		EditText edit_bio=(EditText)findViewById(R.id.editText6);
		EditText edit_dob=(EditText)findViewById(R.id.editText7);

		EditText edit_weight=(EditText)findViewById(R.id.editText9);

		user=edit_user.getText().toString();
		passw=edit_pass.getText().toString();
		name=edit_name.getText().toString();
		mail=edit_mail.getText().toString();
		phon=edit_phone.getText().toString();
		bio=edit_bio.getText().toString();
		dob=edit_dob.getText().toString();

		weight=edit_weight.getText().toString();

		ShowProfile.user=user;
		ShowProfile.passw=passw;
		ShowProfile.name=name;
		ShowProfile.mail=mail;
		ShowProfile.phon=phon;
		ShowProfile.bio=bio;
		ShowProfile.dob=dob;

		ShowProfile.weight=weight;
		RadioGroup gen=(RadioGroup) findViewById(R.id.radioGroup1);
		Button btnGen=(Button) findViewById(R.id.button1);
		int selected = gen.getCheckedRadioButtonId();
		btnGen = (RadioButton) findViewById(selected);

		ShowProfile.gen=btnGen.getText().toString();
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		int count = 0;
		int len=phon.length(); 


		int length = mail.length();

		int temp = mail.length();
		if(mail.contains("@")){
			flag2=true;
			int a=mail.indexOf("@");
			for(int i=a;i<temp;i++){
				if(mail.charAt(i)=='.'){
					flag3=true; 
					count=count+1;
				}
			}
			if(count<1||count>2){
				flag4=false;
			}
			else{
				flag4=true;
			}
			if(mail.matches("[A-Z a-z _]+@*.*"))
				flag5 = true;
			else
				flag5 = false;

		}

		if(user.equals(""))
		{
			Toast.makeText(getApplicationContext(), "Enter username", Toast.LENGTH_LONG).show();
		}
		else
			if(passw.equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG).show();
			}
		if(!user.equals(passw))
		{
			Toast.makeText(getApplicationContext(), "Username and password is not similar ", Toast.LENGTH_LONG).show();
		}
		else
			if(name.equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter the Name", Toast.LENGTH_LONG).show();
			}

			else
				if(flag2 ==false)
				{
					Toast.makeText(getApplicationContext(), "No @ symbol present", Toast.LENGTH_LONG).show();
				}

				else
					if(phon.equals("")||len<10||len>=11) 
					{
						Toast.makeText(getApplicationContext(), "Enter the correct Phone number", Toast.LENGTH_LONG).show();
					}
					else
						if(flag5==false)
							Toast.makeText(getApplicationContext(), "Invalid combination of Email id", Toast.LENGTH_LONG).show();
						else
							if(bio.equals(""))
							{
								Toast.makeText(getApplicationContext(), "Enter the Biography", Toast.LENGTH_LONG).show();
							}
							else
								if(dob.equals(""))
								{
									Toast.makeText(getApplicationContext(), "Enter the Date of Birth", Toast.LENGTH_LONG).show();
								}
								else


									if(weight.equals(""))
									{
										Toast.makeText(getApplicationContext(), "Enter the Weight", Toast.LENGTH_LONG).show();
									}

									else
									{

										startActivity(new Intent(this, ShowProfile.class));
									}
	}


}
