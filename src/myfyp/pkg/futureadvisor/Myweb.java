package myfyp.pkg.futureadvisor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class Myweb extends Activity {
	WebView webView;
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_myweb);
		
		 webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://www.hec.gov.pk/english/universities/pages/rank.aspx");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.myweb, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		//Handle action bar item clicks here. The action bar will
		//automatically handle clicks on the Home/Up button, so long
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
		}
	return super.onOptionsItemSelected(item);
	}
}
