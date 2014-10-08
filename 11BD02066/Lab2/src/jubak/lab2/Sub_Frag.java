package jubak.lab2;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Sub_Frag extends ListFragment {
	
	 public static Sub_Frag newInstance(int pos) {
		    Sub_Frag subs = new Sub_Frag();
		    Bundle args = new Bundle();
		    args.putInt("position", pos);
		    subs.setArguments(args);
		    return subs;
	 }

	 int getPosition() {
		 return getArguments().getInt("position", 0);
	 }

	public interface subEventListener {
	    public void subClickEvent(int pos);
	  }
	
	subEventListener someListener;
	String data[] = new String[] { "SubTitle 0", "SubTitle 1", "SubTitle 2", "SubTitle 3" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	    Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.sub_frag, container, false);
		 TextView tv = (TextView) v.findViewById(R.id.tvSub);
		 tv.setText("Clicked Title "+getPosition());
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
	  super.onActivityCreated(savedInstanceState);
	  ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
	      android.R.layout.simple_list_item_1, data);
	  setListAdapter(adapter);
	}
	
	@Override
	  public void onAttach(Activity activity) {
	    super.onAttach(activity);
	    someListener = (subEventListener) activity;
	  }
	
	public void onListItemClick(ListView l, View v, int position, long id) {
	   super.onListItemClick(l, v, position, id);
	   someListener.subClickEvent(position);
	   Log.e("CLICKED!! ", "CLICKED!!");
	}
	
	
}
