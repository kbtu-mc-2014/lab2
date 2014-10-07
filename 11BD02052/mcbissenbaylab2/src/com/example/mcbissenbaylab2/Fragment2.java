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

public class Fragment2 extends Fragment {
	private ListView listTitles;
	private String [] titles;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.listview_fragment2, null);
		listTitles = (ListView)view.findViewById(R.id.listView2);
		if(Communicator.getCategory() == 0) titles = getResources().getStringArray(R.array.titles0);
		else if(Communicator.getCategory() == 1) titles = getResources().getStringArray(R.array.titles1);
		else if(Communicator.getCategory() == 2) titles = getResources().getStringArray(R.array.titles2);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), 
				android.R.layout.simple_list_item_1, titles);
		listTitles.setAdapter(adapter);
		listTitles.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {	
				Communicator.setTitle(position);
				((MainActivity)getActivity()).changeFragment(R.layout.listview_fragment2);
			}
		});
		return view;
	}
}
