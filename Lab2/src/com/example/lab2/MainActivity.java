package com.example.lab2;


import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity implements Fragment1.OnHeadlineSelectedListener, Fragment2.SelectedListener{

	Fragment1 frag1 = new Fragment1();
	Fragment2 frag2 = new Fragment2();
	Fragment3 frag3 = new Fragment3();
	Bundle newBundle = new Bundle();
	int title = 0;
	int subtitle = 0;

	public void onArticleSelected(int position) {
		// The user selected the headline of an article from the HeadlinesFragment
		// Do something here to display that article
		newBundle.putInt("subtitle", 3 * position);
		Fragment2 newFragment = new Fragment2();
		Bundle args = new Bundle();
		args.putInt("position", 3 * position);
		newFragment.setArguments(args);

		FragmentTransaction transaction = getFragmentManager().beginTransaction();

		// Replace whatever is in the fragment_container view with this fragment,
		// and add the transaction to the back stack so the user can navigate back
		if(getResources().getConfiguration().orientation
				== Configuration.ORIENTATION_LANDSCAPE){
			transaction.replace(R.id.frgmCont2, newFragment);
			transaction.addToBackStack(null);
		}
		else {

			transaction.replace(R.id.frgmCont1, newFragment);
			transaction.addToBackStack(null);
		}

		// Commit the transaction
		transaction.commit();
	}
	@Override
	public void onArticleSelected2(int position) {
		// TODO Auto-generated method stub
		// The user selected the headline of an article from the HeadlinesFragment
		// Do something here to display that article
		Fragment3 newFragment = new Fragment3();
		Bundle args = new Bundle();
		args.putInt("position", newBundle.getInt("subtitle", 0)+position);
		newFragment.setArguments(args);

		FragmentTransaction transaction = getFragmentManager().beginTransaction();

		// Replace whatever is in the fragment_container view with this fragment,
		// and add the transaction to the back stack so the user can navigate back
		if(getResources().getConfiguration().orientation
				== Configuration.ORIENTATION_LANDSCAPE){
			transaction.replace(R.id.frgmCont2, newFragment);
			transaction.addToBackStack(null);
		}
		else {
			transaction.replace(R.id.frgmCont1, newFragment);
			transaction.addToBackStack(null);
		}
		// Commit the transaction
		transaction.commit();

	}


	FragmentTransaction fTrans;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Fragment1 frag = new Fragment1();
		getFragmentManager().beginTransaction().replace(R.id.frgmCont1, frag).commit();

	}
}