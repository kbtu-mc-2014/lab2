package com.example.lab2;

import java.util.Arrays;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment2 extends ListFragment {

	public FragmentTransaction fragTrans;

	SelectedListener mCallback;
	public static Fragment2 newInstance(int pos) {
		Fragment2 fw = new Fragment2();
		Bundle args = new Bundle();
		args.putInt("position", pos);
		fw.setArguments(args);
		return fw;
	}

	// Container Activity must implement this interface

	int getPosition() {
		return getArguments().getInt("position", 0);
	}

	public interface SelectedListener {
		public void onArticleSelected2(int position);
	}
	String values[] ={"Title 0 Subtitle 0", "Title 0 Subtitle 1", "Title 0 Subtitle 2", "Title 1 Subtitle 0", "Title 1 Subtitle 1", "Title 1 Subtitle 2", "Title 2 Subtitle 0", "Title 2 Subtitle 1", "Title 2 Subtitle 2"};

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		int x=getPosition();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, Arrays.copyOfRange(values,x , x+3));
		setListAdapter(adapter);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		// This makes sure that the container activity has implemented
		// the callback interface. If not, it throws an exception
		try {
			mCallback = (SelectedListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement SelectedListener");
		}
	}
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// Send the event to the host activity
		super.onListItemClick(l, v, position, id);
		mCallback.onArticleSelected2(position);
	}




	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment2, null);
		return v;
	}
}
