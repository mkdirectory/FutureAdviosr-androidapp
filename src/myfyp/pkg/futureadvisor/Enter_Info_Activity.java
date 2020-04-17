package myfyp.pkg.futureadvisor;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

public class Enter_Info_Activity extends Activity {
       TextView t1,t2,t3;
       EditText e1,e2;
       Button b1;
       private Spinner spinner2;
       
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.enterinfor);
		t1=(TextView) findViewById(R.id.textView1);
		t2=(TextView) findViewById(R.id.programe);
		e1=(EditText) findViewById(R.id.editText1);
		t3=(TextView) findViewById(R.id.percentage);
		
		final NumberPicker np = (NumberPicker) findViewById(R.id.np);
		np.setMinValue(0);
        //Specify the maximum value/number of NumberPicker
        np.setMaxValue(100);
        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(true);
        np.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        //Set a value change listener for NumberPicker
       spinner2 = (Spinner) findViewById(R.id.spinner2);
			List<String> list = new ArrayList<String>();
			
			list.add("Bachelor of Architecture");
			list.add("Bachelor of Business Administration");
			list.add("Bachelor of Commerce");
			list.add("Bachelor of Computer Information Systems");
			list.add("Bachelor of Science in Construction Technology");
			list.add("Bachelor of Criminal Justice");
			list.add("Bachelor of Economics");
			list.add("Bachelor of Education");
			list.add("Bachelor of Engineering");
			list.add("Bachelor of Fine Arts");
			list.add("Bachelor of Information Systems");
			list.add("Bachelor of Social Work");
			list.add("Bachelor of Technology");
			list.add("Bachelor of Accountancy");
			list.add("Bachelor of Science in Aerospace Engineering");
			list.add("Bachelor of Science in Architecture");
			list.add("Bachelor of Science in Architectural Engineering");
			list.add("Bachelor of Science in Business Administration");
			list.add("Bachelor of Science in Business and Technology");
			list.add("Bachelor of Science in Chemical Engineering");
			list.add("Bachelor of Science in Chemistry");
			list.add("Bachelor of Science in Civil Engineering");
			list.add("Bachelor of Science in Computer Engineering");
			list.add("Bachelor of Science in Computer Science");
			list.add("Bachelor of Science in Criminal Justice");
			list.add("Bachelor of Science in Electrical Engineering");
			list.add("Bachelor of Science in Engineering Technology");
			list.add("Bachelor of Science in English Literature");
			list.add("Bachelor of Science in Environmental Science");
			list.add("Bachelor of Science in History");
			list.add("Bachelor of Science in Human Resources Management");
			list.add("Bachelor of Science in Industrial Engineering");
			list.add("Bachelor of Science in Information Technology");
			list.add("Bachelor of Science in Information Systems");
			list.add("Bachelor of Science in Information Systems");
			list.add("Bachelor of Science in Integrated Science");
			list.add("Bachelor of Science in Integrated Science");
			list.add("Bachelor of Science in International Relations");
			list.add("Bachelor of Science in Journalism");
			list.add("Bachelor of Science in Manufacturing Engineering");
			list.add("Bachelor of Science in Marketing");
			list.add("Bachelor of Science in Mathematics");
			list.add("Bachelor of Science in Mechanical Engineering");
			list.add("Bachelor of Science in Mining Engineering");
			list.add("Bachelor of Science in Software Engineering");
			list.add("Bachelor of Science in Physics");
			list.add("Bachelor of Science in Politics");
			list.add("Bachelor of Science in Psychology");
			list.add("Bachelor of Science in Real-Time Interactive Simulation");
			list.add("Bachelor of Science in Religion");
			list.add("Bachelor of Science in Risk Management and Insurance");
			list.add("Bachelor of Science in Science Education");
			list.add("Bachelor of Science in Systems Engineering");
			list.add("Bachelor of Science in Veterinary Technology");
			
			ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
			dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinner2.setAdapter(dataAdapter);
		 
		b1 = (Button) findViewById(R.id.search);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intenet=new Intent(v.getContext(),List_item1.class);
				intenet.putExtra(List_item1.EXTRA_MAJOR, spinner2.getSelectedItem().toString());
				intenet.putExtra(List_item1.EXTRA_INT, np.getValue());
			
				startActivityForResult(intenet,0);}	
		});
		
		
		
	}
	
	
	 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity1, menu);
		
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
			
		}
		
		else if (id == R.id.exitid) {
		
			return false;
		}
		return super.onOptionsItemSelected(item);
	}
}
