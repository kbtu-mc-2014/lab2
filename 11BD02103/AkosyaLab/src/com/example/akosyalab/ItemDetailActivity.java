package com.example.akosyalab;

import android.support.v4.app.FragmentActivity;
import android.view.View;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

public class ItemDetailActivity extends FragmentActivity {
	ItemDetailFragment fragmentItemDetail;
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_item_detail);
	    Item item = (Item) getIntent().getSerializableExtra("item");
	    if (savedInstanceState == null) {
	      fragmentItemDetail = ItemDetailFragment.newInstance(item); 
	      FragmentTransaction ft = getFragmentManager().beginTransaction();
	      ft.replace(R.id.flDetailContainer, fragmentItemDetail);
	      ft.commit();
	    }
	  }
	
	 public void one(View view){
			Intent intent = new Intent(this, ThirdActivity.class);
			startActivity(intent);
		}
	
//	public void two(View view){
//		Intent intent = new Intent(this, ForthActivity.class);
//		startActivity(intent);
//	}
}
