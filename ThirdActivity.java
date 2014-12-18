package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends ActionBarActivity {
	public static String user="";
	public static String passw="";
	public static String mail="";
	public static String phon="";
	public static String name="";



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exc18);
	}

	public void regBtn(View v) {

		EditText username=(EditText)findViewById(R.id.editText1);
		String usern=username.getText().toString();
		EditText password=(EditText)findViewById(R.id.editText2);
		String pass=password.getText().toString();
		EditText edit_user=(EditText)findViewById(R.id.editText3);
		String user_name=edit_user.getText().toString();
		EditText edit_email=(EditText)findViewById(R.id.editText4);
		String email=edit_email.getText().toString();
		EditText edit_phone=(EditText)findViewById(R.id.editText5);
		String phone=edit_phone.getText().toString();
		
		
		user=usern;
		passw=pass;
		name=user_name;
		mail=email;
		phon=phone;
		
		
		HomePage.name=name;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		int count = 0;
		int len=phone.length(); 


		int length = email.length();

		int temp = email.length();
		if(email.contains("@")){
			flag2=true;
			int a=email.indexOf("@");
			for(int i=a;i<temp;i++){
				if(email.charAt(i)=='.'){
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
			if(email.matches("[A-Z a-z _]+@*.*"))
				flag5 = true;
			else
				flag5 = false;

		}


		if(usern.equals(""))
		{
			Toast.makeText(getApplicationContext(), "Enter username", Toast.LENGTH_LONG).show();
		}
		else
			if(pass.equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_LONG).show();
			}
			if(!usern.equals(pass))
			{
				Toast.makeText(getApplicationContext(), "Username and password is not similar ", Toast.LENGTH_LONG).show();
			}
			else
				if(user_name.equals(""))
				{
					Toast.makeText(getApplicationContext(), "Enter the Name", Toast.LENGTH_LONG).show();
				}

				else
					if(flag2 ==false)
					{
						Toast.makeText(getApplicationContext(), "No @ symbol present", Toast.LENGTH_LONG).show();
					}

					else
						if(phone.equals("")||len<10||len>=11) 
						{
							Toast.makeText(getApplicationContext(), "Enter the correct Phone number", Toast.LENGTH_LONG).show();
						}
						else
							if(flag5==false)
								Toast.makeText(getApplicationContext(), "Invalid combination of Email id", Toast.LENGTH_LONG).show();

							else
							{
								startActivity(new Intent(this, HomePage.class));
							}
	}


}


