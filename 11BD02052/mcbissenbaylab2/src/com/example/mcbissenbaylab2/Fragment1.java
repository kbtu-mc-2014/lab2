package com.example.mcbissenbaylab2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Fragment1 extends Fragment {
	
	private ListView listCategories;
	private String [] categories;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.listview_fragment1, null);
		listCategories = (ListView)view.findViewById(R.id.listView1);
		categories = getResources().getStringArray(R.array.categories);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), 
				android.R.layout.simple_list_item_1, categories);
		listCategories.setAdapter(adapter);
		listCategories.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {	
				Communicator.setCategory(position);
				((MainActivity)getActivity()).changeFragment(R.layout.listview_fragment1);
			}
		});
		return view;
	}	
}
