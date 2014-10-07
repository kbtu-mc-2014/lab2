package com.example.mcbissenbaylab2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment3 extends Fragment {
	private TextView myTextView;
	private String [] articles;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.textview_fragment3, null);
		myTextView = (TextView)view.findViewById(R.id.textView1);
		if(Communicator.getCategory() == 0) articles = getResources().getStringArray(R.array.titles0articles);
		else if(Communicator.getCategory() == 1) articles = getResources().getStringArray(R.array.titles1articles);
		else if(Communicator.getCategory() == 2) articles = getResources().getStringArray(R.array.titles2articles);
		myTextView.setText(articles[Communicator.getTitle()]);
		return view;
	}
}
