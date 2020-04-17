package myfyp.pkg.futureadvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Ranking_Activity extends Activity {
	TextView text1,text2;
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ranking);
		text1=(TextView) findViewById(R.id.ranking);
		text2=(TextView) findViewById(R.id.aboutustextid);
		button = (Button) findViewById(R.id.buttonUrl);

		button.setOnClickListener(new OnClickListener() {

		  public void onClick(View arg0) {
		    Intent intent = new Intent(getBaseContext(),Myweb.class);
		    startActivity(intent);
		  }

		});

		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ranking, menu);
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
