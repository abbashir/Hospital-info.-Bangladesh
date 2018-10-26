package com.techitlarge.hospitalinfobangladesh;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Delta extends Activity {
	private ImageButton b1,b2,b3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_delta);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setIcon(
				   new ColorDrawable(getResources().getColor(android.R.color.transparent)));   
		 b1 = (ImageButton) findViewById(R.id.deltacal);
		 b1.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:+880312550005"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b2 = (ImageButton) findViewById(R.id.deltaamb);
		 b2.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:+880312550005"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b3 = (ImageButton) findViewById(R.id.deltames);
		 b3.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:+880312550005"));
		                startActivity(i);
	              
	 
	            }
	        });
	}
	public void process(View view){
		Intent intent=null;
		if (view.getId()==R.id.deltamap) {
			intent=new Intent(android.content.Intent.ACTION_VIEW);
			intent.setData(Uri.parse("geo:22.364938, 91.834317"));
			startActivity(intent);
		}
		
	}


}
