package com.example.lab2;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment3 extends Fragment {

	public static Fragment3 getInstance(int pos){
		Fragment3 fw = new Fragment3();
		Bundle args = new Bundle();
	    args.putInt("position", pos);
	    fw.setArguments(args);
	    return fw;
	}
	TextView ET;
	String []data = {"Title 0 Subtitle 0 text", "Title 0 Subtitle 1 text", "Title 0 Subtitle 2 text", "Title 1 Subtitle 0 text", "Title 1 Subtitle 1 text", "Title 1 Subtitle 2 text", "Title 2 Subtitle 0 text", "Title 2 Subtitle 1 text", "Title 2 Subtitle 2 text" };
	String getText(){
		int x = getArguments().getInt("position", 0);
		if( x >= data.length) return "empty";
		return data[x];
	}
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        View view=inflater.inflate(R.layout.fragment3, container,false);
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText(getText());
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        ET=(TextView) getActivity().findViewById(R.id.text);
    }
}
