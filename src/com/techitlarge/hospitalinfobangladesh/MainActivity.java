package com.techitlarge.hospitalinfobangladesh;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static long time;
Button rmc,ibhr,pdc,rrl,j,m,d,Me,Is, apollo,ramch,Square,shereb,dmch,mmch,shaikh,shishu,kmch,Salimullah,ibns,delta,ekushe,centre,north,about;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rmc = (Button) findViewById(R.id.rmc1);
		rmc.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Rmch.class);
	                startActivity(it);
	 
	            }
	        });
		ibhr = (Button) findViewById(R.id.ibh1);
		ibhr.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Ibhr.class);
	                startActivity(it);
	 
	            }
	        });
		pdc = (Button) findViewById(R.id.pdc1);
		pdc.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Pdc.class);
	                startActivity(it);
	 
	            }
	        });
		rrl = (Button) findViewById(R.id.rrl1);
		rrl.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Rrl.class);
	                startActivity(it);
	 
	            }
	        });
		j = (Button) findViewById(R.id.jjh1);
		j.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Jjih.class);
	                startActivity(it);
	 
	            }
	        });
		m = (Button) findViewById(R.id.mdc1);
		m.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Mdc.class);
	                startActivity(it);
	 
	            }
	        });
		d = (Button) findViewById(R.id.dc1);
		d.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Dc.class);
	                startActivity(it);
	 
	            }
	        });
		Is = (Button) findViewById(R.id.bmc1);
		Is.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Bmc.class);
	                startActivity(it);
	 
	            }
	        });
		//dhaka start
		apollo = (Button) findViewById(R.id.apollo);
		apollo.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,ApolloDhaka.class);
	                startActivity(it);
	 
	            }
	        });
		Square = (Button) findViewById(R.id.Square);
		Square.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Square.class);
	                startActivity(it);
	 
	            }
	        });
		dmch = (Button) findViewById(R.id.dmch);
		dmch.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Dhakamcollege.class);
	                startActivity(it);
	 
	            }
	        });
	
		Salimullah = (Button) findViewById(R.id.Salimullah);
		Salimullah.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Shalimullah.class);
	                startActivity(it);
	 
	            }
	        });
		
		// chattogram start
		
		delta = (Button) findViewById(R.id.delta);
		delta.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Delta.class);
	                startActivity(it);
	 
	            }
	        });
		ekushe = (Button) findViewById(R.id.Ekushey);
		ekushe.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Ekushe.class);
	                startActivity(it);
	 
	            }
	        });
		centre = (Button) findViewById(R.id.Centre);
		centre.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Centre.class);
	                startActivity(it);
	 
	            }
	        });
		//shylhet 
		north = (Button) findViewById(R.id.North);
		north.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,North.class);
	                startActivity(it);
	 
	            }
	        });
		ibns = (Button) findViewById(R.id.ibnshyl);
		ibns.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Ibnshyl.class);
	                startActivity(it);
	 
	            }
	        });
		//khulna
		kmch = (Button) findViewById(R.id.kmch);
		kmch.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Kmch.class);
	                startActivity(it);
	 
	            }
	        });
		shaikh = (Button) findViewById(R.id.shaikh);
		shaikh.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Shaikh.class);
	                startActivity(it);
	 
	            }
	        });
		
		shishu = (Button) findViewById(R.id.ksh);
		shishu.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Shishu.class);
	                startActivity(it);
	 
	            }
	        });
		//myshing
		mmch = (Button) findViewById(R.id.mmch);
		mmch.setOnClickListener(new OnClickListener() {
			 
	            public void onClick(View v) {
	               
	                Intent it=new Intent(MainActivity.this,Mmch.class);
	                startActivity(it);
	 
	            }
	        });
		//barishal
				shereb = (Button) findViewById(R.id.sherebangla);
				shereb.setOnClickListener(new OnClickListener() {
					 
			            public void onClick(View v) {
			               
			                Intent it=new Intent(MainActivity.this,Sherebangla.class);
			                startActivity(it);
			 
			            }
			        });
				//rangpur
				ramch = (Button) findViewById(R.id.rangmch);
				ramch.setOnClickListener(new OnClickListener() {
					 
			            public void onClick(View v) {
			               
			                Intent it=new Intent(MainActivity.this,Ramch.class);
			                startActivity(it);
			 
			            }
			        });
	} 

	/* (non-Javadoc)
	 * @see android.app.Activity#onBackPressed()
	 */
	@Override
	public void onBackPressed() {
		if(time + 2000 >System.currentTimeMillis()){
			super.onBackPressed();
		} else{
			Toast.makeText(MainActivity.this, "Press again to close the app", Toast.LENGTH_SHORT).show();
		}
		time=System.currentTimeMillis();

		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
 
        int id = item.getItemId();
 
 
       
        if (id == R.id.about) { 
        	 Intent it=new Intent(MainActivity.this,Ab.class);
                startActivity(it);
 
        	 
        }
        return super.onOptionsItemSelected(item);
    }

}
