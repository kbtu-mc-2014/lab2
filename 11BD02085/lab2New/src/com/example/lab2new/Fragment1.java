package com.example.lab2new;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Fragment1 extends Fragment {
	
	private ListView listView;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment1, null);
		String[] items = {"D2", "CS:GO", "Hearthstone", "StarCraft 2"};
		listView = (ListView) view.findViewById(R.id.listView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	          Log.d("MC", "itemClick: position = " + position + ", id = "+id);
	          ((MainActivity)getActivity()).replaceFragment(R.layout.fragment1);
	        }
	      });
		return view;
	}
	public void onStart(){
		super.onStart();
	    Log.d("My Log", "Fragment1 onStart");
	}
	public void onDetach() {
	    super.onDetach();
	    Log.d("My Log", "Fragment1 onDetach");
	  }
	 public void onResume() {
		    super.onResume();
		    Log.d("My Log", "Fragment1 onResume");
		  }

		  public void onPause() {
		    super.onPause();
		    Log.d("My Log", "Fragment1 onPause");
		  }
}
