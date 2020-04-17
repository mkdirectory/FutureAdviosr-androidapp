package myfyp.pkg.futureadvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.TextView;

public class AdmissionCriteria extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admission_criteria);
		
		
		TextView tv2=(TextView)findViewById(R.id.admissioncrihd);
		tv2.setMovementMethod(new ScrollingMovementMethod());
		TextView tv=(TextView)findViewById(R.id.admissioncritext);
		tv.setMovementMethod(new ScrollingMovementMethod());
		TextView tv1=(TextView)findViewById(R.id.admissioncritext2);
		tv1.setMovementMethod(new ScrollingMovementMethod());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admission_criteria, menu);
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
		else if (id == R.id.homeid) {
			Intent mainIntent = new Intent(this,MainActivity.class); 
			startActivity(mainIntent);
			return true;}
		
		
		else if (id == R.id.exitid) {
		
			finish();
			System.exit(0);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
