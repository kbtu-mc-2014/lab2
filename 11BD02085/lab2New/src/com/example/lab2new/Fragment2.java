package com.example.lab2new;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment2 extends Fragment {
	private ListView listView;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment2, null);
		String[] items = {"NaVi", "Evil Geniuses", "Cloud9", "Empire"};
		listView = (ListView) view.findViewById(R.id.listView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	          Log.d("MC", "itemClick: position = " + position + ", id = "+id);
	          ((MainActivity)getActivity()).replaceFragment(R.layout.fragment2);
	        }
	      });
		return view;
	}
	public void onStart(){
		super.onStart();
	    Log.d("My Log", "Fragment2 onStart");
	}
	public void onDetach() {
	    super.onDetach();
	    Log.d("My Log", "Fragment2 onDetach");
	  }
	public void onResume() {
	    super.onResume();
	    Log.d("My Log", "Fragment2 onResume");
	  }

	  public void onPause() {
	    super.onPause();
	    Log.d("My Log", "Fragment2 onPause");
	  }
}
