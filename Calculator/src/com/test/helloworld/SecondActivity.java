package com.test.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class SecondActivity extends HelloWorld {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.second_layout);
	}
	
	public void back(View view){
		finish();
	}
	public void call10086(View v){
		Intent intent=new Intent(Intent.ACTION_DIAL);
		intent.setData(Uri.parse("tel:10086"));
		startActivity(intent);
	}
	public void gotogoogle(View v){
		Intent intent=new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://www.google.com"));
		startActivity(intent);
	}
}
