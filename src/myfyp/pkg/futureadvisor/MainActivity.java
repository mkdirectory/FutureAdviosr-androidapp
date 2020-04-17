package myfyp.pkg.futureadvisor;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	     TextView text1,text2;
	     Button b1,b2,b3,b4,b5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text1=(TextView) findViewById(R.id.welcometv);
		text2=(TextView) findViewById(R.id.welcometexttv);
		b1=(Button) findViewById(R.id.schocri);
		b2=(Button) findViewById(R.id.reqper);
		b3=(Button) findViewById(R.id.rankingid);
		b4=(Button) findViewById(R.id.adcri);
		b5=(Button) findViewById(R.id.next);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intenet = new Intent(v.getContext(),ScholorshipCriteria.class);
			    startActivityForResult(intenet,0);
			}
		});
		
		
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intenet=new Intent(v.getContext(),RequiredPercentage.class);
				startActivityForResult(intenet,0);	
			}
		});
		
b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intenet = new Intent(v.getContext(),Ranking_Activity.class);
			    startActivityForResult(intenet,0);
			}
		});
b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intenet = new Intent(v.getContext(),AdmissionCriteria.class);
	    startActivityForResult(intenet,0);
	}
});
b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intenet = new Intent(v.getContext(),Options.class);
	    startActivityForResult(intenet,0);
	}
});
			
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.aboutusid) {
			Intent aboutusintent = new Intent(this,Aboutus_Activity.class); 
			startActivity(aboutusintent);
			return true;
		}
		else if (id == R.id.helpid) {
			Intent helpIntent = new Intent(this,Help_Activity.class); 
			startActivity(helpIntent);
			return true;
		}
		
		else if (id == R.id.exitid) {
		
			finish();
			System.exit(0);
		}
		
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}
}

