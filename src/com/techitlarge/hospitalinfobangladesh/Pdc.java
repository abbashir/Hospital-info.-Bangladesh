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

public class Pdc extends Activity {
	private ImageButton b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pdc);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setIcon(
				   new ColorDrawable(getResources().getColor(android.R.color.transparent)));
		 b1 = (ImageButton) findViewById(R.id.pcal);
		 b1.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:0721812117"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b2 = (ImageButton) findViewById(R.id.pamb);
		 b2.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent it=new Intent(Intent.ACTION_CALL,Uri.parse("tel:0721812117"));
		                startActivity(it);
	              
	 
	            }
	        });
		 b3 = (ImageButton) findViewById(R.id.pmes);
		 b3.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	            	  Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:0721812119"));
		                startActivity(i);
	              
	 
	            }
	        });
	}
	public void process(View view){
		Intent intent=null;
		if (view.getId()==R.id.pmap) {
			intent=new Intent(android.content.Intent.ACTION_VIEW);
			intent.setData(Uri.parse("geo:24.372235, 88.581099"));
			startActivity(intent);
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pdc, menu);
		return true;
	}

}
