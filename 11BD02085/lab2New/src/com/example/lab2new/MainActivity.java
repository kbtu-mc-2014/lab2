package com.example.lab2new;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity{
	
	private Fragment1 frgm1 = new Fragment1();
	private Fragment2 frgm2 = new Fragment2();
	private Fragment3 frgm3 = new Fragment3();
	
	private FragmentTransaction fTrans;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fTrans = getFragmentManager().beginTransaction();
		fTrans.add(R.id.fragmCont,frgm1);
		fTrans.commit();
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void replaceFragment(int id){
		fTrans = getFragmentManager().beginTransaction();
		fTrans.remove(frgm1);
		fTrans.remove(frgm2);
		if (R.layout.fragment1==id)
			fTrans.replace(R.id.fragmCont, frgm2);
		else fTrans.replace(R.id.fragmCont, frgm3);
		fTrans.addToBackStack(null);
		fTrans.commit();
	}
}
