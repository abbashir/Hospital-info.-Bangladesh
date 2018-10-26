package com.techitlarge.hospitalinfobangladesh;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Bmc extends Activity {
	private ImageButton b1,b2,b3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bmc);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setIcon(
				   new ColorDrawable(getResources().getColor(android.R.color.transparent)));
		 b1 = (ImageButton) findViewById(R.id.bcal);
		 b1.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:+8801777242402"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b2 = (ImageButton) findViewById(R.id.bamb);
		 b2.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:+8801716129375"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b3 = (ImageButton) findViewById(R.id.bmes);
		 b3.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:+8801777242402"));
		                startActivity(i);
	              
	 
	            }
	        });

	}
	public void process(View view){
		Intent intent=null;
		if (view.getId()==R.id.bmap) {
			intent=new Intent(android.content.Intent.ACTION_VIEW);
			intent.setData(Uri.parse("geo:24.382422, 88.624044"));
			startActivity(intent);
		}
		
	}


}
