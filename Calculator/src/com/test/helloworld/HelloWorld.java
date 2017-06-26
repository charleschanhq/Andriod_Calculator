package com.test.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HelloWorld extends ActionBarActivity {

private double first;
private double second;
private long sign=0;
private long count=0;
private TextView output1;
private TextView output2;
private double answer;
private String errortext;
private int oldnumber;	
private int dot=0;
private int decimallength;
private double oldnumber2;
private double save;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		setTitle("Calculator");
		TextView output1= (TextView) findViewById(R.id.textView1);
		TextView output2=(TextView) findViewById(R.id.textView2);
		output1.setText(" Calculator");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
		return true;
	}

    
	//public void go(View view){
		//Intent intent1=new Intent(this, SecondActivity.class);
		//startActivity(intent1);
	//}
	
	//public void go2(View view){
		//Intent intent2=new Intent(this, ThirdActivity.class);
		//startActivity(intent2);
	//}
	
	private void go(View v){
		Intent intent=new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://www.zhenyuanfarm.com/"));
		startActivity(intent);
	}
	private void go2(View v){
		Intent intent=new Intent(Intent.ACTION_DIAL);
		intent.setData(Uri.parse("tel:13916025771"));
		startActivity(intent);}
	private void pressdot(View v){
		dot=1;	
		save=oldnumber;
		TextView output2=(TextView) findViewById(R.id.textView2);
		output2.setText(oldnumber+".");
		oldnumber=922337200;
	}
	private void pressone( View sender){      
		if(dot==0){
		count++;
		TextView output2=(TextView) findViewById(R.id.textView2);
		count++;
		 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
	     oldnumber=1;}
		 else { oldnumber=oldnumber*10+1;
			 }
		 output2.setText(""+oldnumber);}
		else {			
			TextView output2=(TextView) findViewById(R.id.textView2);
			if(oldnumber==922337200){oldnumber=1; output2.setText(""+save); }
			else{ oldnumber=oldnumber*10+1; }
			decimallength=Integer.toString(oldnumber).length();
			oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
			output2.setText(""+oldnumber2);
		}			
		
	}
	
	
	private void presstwo(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=2;}
			 else { oldnumber=oldnumber*10+2;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=2; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+2; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
			
	}
	
	private void pressthree(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=3;}
			 else { oldnumber=oldnumber*10+3;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=3; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+3; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
	}
	
	
	private void pressfour(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=4;}
			 else { oldnumber=oldnumber*10+4;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=4; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+4; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
			
}
		 
	private void pressfive(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=5;}
			 else { oldnumber=oldnumber*10+5;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=5; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+5; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
			
	}

	private void presssix(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=6;}
			 else { oldnumber=oldnumber*10+6;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=6; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+6; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
			
	}
	
	private void press7(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=7;}
			 else { oldnumber=oldnumber*10+7;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=7; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+7; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
	}
	
	private void presseight(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=8;}
			 else { oldnumber=oldnumber*10+8;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=8; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+8; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
	}
	
	private void pressnine(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=9;}
			 else { oldnumber=oldnumber*10+9;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=9; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+9; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
			
	}
	
	private void presszero(View v){
		if(dot==0){
			count++;
			TextView output2=(TextView) findViewById(R.id.textView2);
			count++;
			 if ((Integer.toString(oldnumber).length()<1) || (oldnumber==0)){
		     oldnumber=0;}
			 else { oldnumber=oldnumber*10+0;
				 }
			 output2.setText(""+oldnumber);}
			else {			
				TextView output2=(TextView) findViewById(R.id.textView2);
				if(oldnumber==922337200){oldnumber=0; output2.setText(""+save); }
				else{ oldnumber=oldnumber*10+0; }
				decimallength=Integer.toString(oldnumber).length();
				oldnumber2=(save+oldnumber/(double)(Math.pow(10, decimallength)));
				output2.setText(""+oldnumber2);
			}			
			
	}
	
	private void pressplus(View v){
		sign=1;
		count++;
		first=0;
		if (dot==0){first=oldnumber;}
		if (dot==1){first=oldnumber2;}
		oldnumber=0;
		dot=0;
		oldnumber2=0;
		decimallength=0;
		save=0;
	}
	
	private void presssubtract( View v){
		
		sign=2;
		first=0;
		count++;
		if (dot==0){first=oldnumber;}
		if (dot==1){first=oldnumber2;}
		oldnumber=0;
		dot=0;
		oldnumber2=0;
		save=0;
		decimallength=0;
	}
	
	private void presstimes( View v){
		sign=3;
		count++;
		first=0;
		if(dot==0){first=oldnumber;}
		if (dot==0){first=oldnumber2;}
		oldnumber=0;
		oldnumber2=0;
		dot=0;
		save=0;
		decimallength=0;
	}
	
	private void pressover( View v){
		sign=4;
		count++;
		first=0;
		if(dot==0){first=oldnumber;}
		if(dot==1){first=oldnumber2;}
		dot=0;
		oldnumber2=0;
		oldnumber=0;
		save=0;
		decimallength=0;	
	}
	
	
	private void reset(View v){
		TextView output2 = (TextView) findViewById(R.id.textView2);
		TextView output1 = (TextView) findViewById(R.id.textView1);
		first=0;
		second=0;
		count=0;
		sign=0;
		answer=0;
		oldnumber=0;
		double answer=0;
		dot=0;
		oldnumber2=0;
		save=0;
		decimallength=0;
		output2.setText(""+answer);
		output1.setText("Cleared.");
		
	}
	
    private void reset() {
    	first=0;
    	second=0;
    	count=0;
    	sign=0;
    	answer=0;
    	oldnumber=0;
    	double answer=0;
    }
	
	private void clearhistory(View v){     //clear the history
		TextView output3= (TextView) findViewById(R.id.textView3);
		list="no history";
		output3.setText(list);
		list="";
		TextView output2=(TextView) findViewById(R.id.textView2);
		output2.setText("");
	}
	
	String list="";
	String lastnumber;
	TextView output3;
	
	// the "contact the author button" starts here
	private void showauthor (View v){
		Toast.makeText(HelloWorld.this,"Designed by HanqingChen"+"\n"+"contact: charleschanhq@gmail.com",
		Toast.LENGTH_SHORT).show();
	}
	private void pressequal(View v){
		if(dot==1){second=oldnumber2;}
		if(dot==0){second=oldnumber;}
		TextView output2 = (TextView) findViewById(R.id.textView2);
		if (sign==0){ 
			if (dot==0){answer=oldnumber;}
			if (dot==1){answer=oldnumber2;}
		}
		if( sign==1){
			answer=first+second;
			}
	    if( sign==2){
	    	answer=first-second;
	    	}
		if( sign==3){
			answer=first*second;
			}
		if( sign==4){
			answer=(double)first/second;
			}		
		output2.setText(""+answer);		
		
		lastnumber=Double.toString(answer);
		TextView output3=(TextView) findViewById(R.id.textView3);
		if (list.length()<1){
			list=lastnumber;
			output3.setText(list);
		}
		else {
			list=lastnumber+" "+"\n"+list;
			output3.setText(list);
		}
		TextView output1=(TextView) findViewById(R.id.textView1);
		output1.setText("Done");
		reset();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

// 2015.04.21  V 1.0.0
// 2015.04.23  V 1.0.1    fix the resolution problem 
//                        add the background image 
//                        fix the history window problem (the last answer will show on the top)
//                        round the button &  make the font bigger 
// 2015.05.04  V1.0.3     support the decimal number 
//                        add the button click effect
//                        add two more activity( function undecided)
//                        fix the 1.5+1.5=6.5 problem

