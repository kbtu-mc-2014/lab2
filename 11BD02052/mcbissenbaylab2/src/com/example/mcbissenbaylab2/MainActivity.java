package com.example.mcbissenbaylab2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	private FragmentTransaction fragmentTransaction;
	private FragmentManager fragmentManager;
	private Fragment frag;
	int orientation;
	ListView myListView1, myListView2;
	String [] categories1, titles1, articles1;
	TextView myTextView1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if(getResources().getConfiguration().orientation ==
				Configuration.ORIENTATION_PORTRAIT) {
			fragmentManager = getSupportFragmentManager();
			fragmentTransaction = fragmentManager.beginTransaction();
			frag = new Fragment1();
			fragmentTransaction.add(R.id.frameLayout, frag);
			fragmentTransaction.commit();
		} else if(getResources().getConfiguration().orientation ==
				Configuration.ORIENTATION_LANDSCAPE) {
			myListView1 = (ListView)findViewById(R.id.listView1);
			myListView2 = (ListView)findViewById(R.id.listView2);
			myTextView1 = (TextView)findViewById(R.id.textView1);
			myListView2.setVisibility(View.GONE);
			myTextView1.setVisibility(View.GONE);
			categories1 = getResources().getStringArray(R.array.categories);
			ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
	                android.R.layout.simple_list_item_1, categories1);
			myListView1.setAdapter(adapter1);			
			myListView1.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Communicator.setCategory(position);
					if(position == 0) titles1 = getResources().getStringArray(R.array.titles0);
					else if(position == 1) titles1 = getResources().getStringArray(R.array.titles1);
					else if(position == 2) titles1 = getResources().getStringArray(R.array.titles2);
					ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getBaseContext(),
			                android.R.layout.simple_list_item_1, titles1);
					myListView2.setAdapter(adapter2);
					myListView2.setVisibility(View.VISIBLE);
				}
			});
			myListView2.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					if(Communicator.getCategory() == 0) articles1 = getResources().getStringArray(R.array.titles0articles);
					else if(Communicator.getCategory() == 1) articles1 = getResources().getStringArray(R.array.titles1articles);
					else if(Communicator.getCategory() == 2) articles1 = getResources().getStringArray(R.array.titles2articles);
					myTextView1.setText(articles1[position]);
					myTextView1.setVisibility(View.VISIBLE);
				}
			});
		}
		
	}
	
	public void changeFragment(int id) {
			fragmentTransaction = fragmentManager.beginTransaction();
			if(id == R.layout.listview_fragment1) {
				frag = new Fragment2();
			} else if (id == R.layout.listview_fragment2) {
				frag = new Fragment3();
			}
			fragmentTransaction.replace(R.id.frameLayout, frag);
			fragmentTransaction.addToBackStack(null);
			fragmentTransaction.commit();
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
