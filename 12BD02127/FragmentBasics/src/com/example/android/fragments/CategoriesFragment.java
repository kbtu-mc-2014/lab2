package com.example.android.fragments;

import com.example.android.fragments.HeadlinesFragment.OnHeadlineSelectedListener;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoriesFragment extends ListFragment{
	onCategoryClickedListener cl;
	
	public interface onCategoryClickedListener {
		public void onHeadlineSelected(int position);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		int layout = android.R.layout.simple_list_item_1;
		setListAdapter(new ArrayAdapter<String>(getActivity(), layout, Ipsum.Categories));
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if(getFragmentManager().findFragmentById(R.id.categories_fragment) != null) {
			getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		}
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		
		try{
			cl = (onCategoryClickedListener) activity;
		}catch(ClassCastException e){
			throw new ClassCastException(activity.toString() +"must implement");
		}
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		cl.onHeadlineSelected(position);
		getListView().setItemChecked(position, true);
	}
}
