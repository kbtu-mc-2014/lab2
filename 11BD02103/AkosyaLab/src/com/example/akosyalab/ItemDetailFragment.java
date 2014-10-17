package com.example.akosyalab;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ItemDetailFragment extends Fragment {
	private Item item;
	Button button1;
	Button button2;
	Button button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      item = (Item) getArguments().getSerializable("item");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_item_detail, 
          container, false);
      
      button1 = (Button) view.findViewById(R.id.oneid);
      button2 = (Button) view.findViewById(R.id.twoid);
      button3 = (Button) view.findViewById(R.id.threeid);
      
      button1.setText("Article 1");
      button2.setText("Article 2");
      button3.setText("Article 3");
      return view;
    }
    

	  public static ItemDetailFragment newInstance(Item item) {
		    ItemDetailFragment fragmentDemo = new ItemDetailFragment();
		    Bundle args = new Bundle();
		    args.putSerializable("item", item);
		    fragmentDemo.setArguments(args);
		    return fragmentDemo;
		  }
}