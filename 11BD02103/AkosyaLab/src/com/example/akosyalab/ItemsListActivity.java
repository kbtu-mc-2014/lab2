package com.example.akosyalab;


import com.example.akosyalab.ItemsListFragment.OnListItemSelectedListener;


import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;


public class ItemsListActivity extends FragmentActivity implements OnListItemSelectedListener {

	private boolean isTwoPane = false;

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_items_list);
	    determinePaneLayout();
	  }

	  private void determinePaneLayout() {
		    FrameLayout fragmentItemDetail = (FrameLayout) findViewById(R.id.flDetailContainer);
		    if (fragmentItemDetail != null) {
		      isTwoPane = true;
		      ItemsListFragment fragmentItemsList = 
		          (ItemsListFragment) getFragmentManager().findFragmentById(R.id.fragmentItemsList);
		      fragmentItemsList.setActivateOnItemClick(true);
		    }
		  }
	  @Override
	    public void onItemSelected(Item item) {
	      if (isTwoPane) { 
	        ItemDetailFragment fragmentItem = ItemDetailFragment.newInstance(item);
	        FragmentTransaction ft = getFragmentManager().beginTransaction();
	        ft.replace(R.id.flDetailContainer, fragmentItem);
	        ft.commit();
	      } else { 
	        Intent i = new Intent(this, ItemDetailActivity.class);
	        i.putExtra("item", item);
	        startActivity(i);
	      }
	    }
	  public void one(View view){
			Intent intent = new Intent(this, ThirdActivity.class);
			startActivity(intent);
		}
    
}
