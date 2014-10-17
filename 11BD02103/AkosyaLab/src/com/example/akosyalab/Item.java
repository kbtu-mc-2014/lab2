package com.example.akosyalab;

import java.io.Serializable;
import java.util.ArrayList;

public class Item implements Serializable {
	  private static final long serialVersionUID = -1213949467658913456L;
	  private String title;

	  public Item(String title) {
	    this.title = title;
	  }

	  public String getTitle() {
	    return title;
	  }

	  @Override
	  public String toString() {
	    return getTitle();
	  }

	  public static ArrayList<Item> getItems() {
	    ArrayList<Item> items = new ArrayList<Item>();
	    items.add(new Item("Category 1"));
	    items.add(new Item("Category 2"));
	    items.add(new Item("Category 3"));
	    return items;
	  }
	}
