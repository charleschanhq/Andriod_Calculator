package com.test.helloworld;

import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends HelloWorld {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.third_layout);
	}
	
	public void back(View view){
		finish();
	}
}
