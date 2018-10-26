package com.techitlarge.hospitalinfobangladesh;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class Ab extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ab);
		
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setIcon(
				   new ColorDrawable(getResources().getColor(android.R.color.transparent)));  
	}

	
}
