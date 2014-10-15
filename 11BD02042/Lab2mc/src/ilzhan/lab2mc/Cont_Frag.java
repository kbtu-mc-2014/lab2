package ilzhan.lab2mc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Cont_Frag extends Fragment {
	
	 public static Cont_Frag newInstance(int pos) {
		    Cont_Frag cont = new Cont_Frag();
		    Bundle args = new Bundle();
		    args.putInt("position", pos);
		    cont.setArguments(args);
		    return cont;
	 }

	 int getPosition() {
		 return getArguments().getInt("position", 0);
	 }

	 @Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	     Bundle savedInstanceState) {
		 View v = inflater.inflate(R.layout.cont_frag, container, false);
		 TextView tv = (TextView) v.findViewById(R.id.tvContent);
		 tv.setText("Clicked SubTitle "+getPosition());
		 return v;
	 }
}
