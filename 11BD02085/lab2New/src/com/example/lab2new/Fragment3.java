package com.example.lab2new;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Fragment3 extends Fragment{
	
	TextView tw;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment3, null);
		tw = (TextView) view.findViewById(R.id.textView1);
		String s = "The four-day double elimination bracket saw several upsets, such as the early elimination of the experienced Union Gaming. " +
				"While paiN reached the Grand Final without dropping a single match, Isurus had to survive the demanding Lower Bracket. In the LB finals, they met and defeated the pleasant surprise of the competition, " +
				"Keyd Stars, who managed to reach the solid third place despite being considered amongst the underdogs of the tournament." +
				"The Brazilian favorites paiN Gaming entered the final with a WB game advantage, which they used well to finish the series with a fast and clean 3-0. " +
				"Isurus Gaming showed significant resistance in the last match of the series, despite the massive physical damage coming out of the Drow Ranger - Visage - Death Prophet trio. " +
				"Both squads forced several clumsy teamfights in the ending moments of the match, but the overwhelming advantage of the Brazilians led their way to victory.";
		tw.setText(s);
		return view;
	}
	public void onStart(){
		super.onStart();
	    Log.d("My Log", "Fragment3 onStart");
	}
	public void onDetach() {
	    super.onDetach();
	    Log.d("My Log", "Fragment3 onDetach");
	  }
	public void onResume() {
	    super.onResume();
	    Log.d("My Log", "Fragment3 onResume");
	  }

	  public void onPause() {
	    super.onPause();
	    Log.d("My Log", "Fragment3 onPause");
	  }
}
