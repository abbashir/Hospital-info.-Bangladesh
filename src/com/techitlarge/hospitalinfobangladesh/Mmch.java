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

public class Mmch extends Activity {
	private ImageButton b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mmch);
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setIcon(
				   new ColorDrawable(getResources().getColor(android.R.color.transparent)));   
		 b1 = (ImageButton) findViewById(R.id.mmchcal);
		 b1.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:09166063"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b2 = (ImageButton) findViewById(R.id.mmchamb);
		 b2.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:09166063"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b3 = (ImageButton) findViewById(R.id.mmchmes);
		 b3.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:09166063"));
		                startActivity(i);
	              
	 
	            }
	        });
	}
	public void process(View view){
		Intent intent=null;
		if (view.getId()==R.id.mmchmap) {
			intent=new Intent(android.content.Intent.ACTION_VIEW);
			intent.setData(Uri.parse("geo:24.744143, 90.409435"));
			startActivity(intent);
		}
		
	}

}
