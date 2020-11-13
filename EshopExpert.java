package com.example.model;

import java.util.*;

public class EshopExpert {
	public List<String> getBrands(String state) {
		List<String> brands = new ArrayList<String>();
		if (state.equals("Desktop")) {
			brands.add("TurboX");
			brands.add("HP");
			brands.add("Dell");
		}
		else if(state.equals("Laptop")) {
			brands.add("HP");
			brands.add("Dell");
			brands.add("Lenovo");
			brands.add("ASUS");
		}
		else {
			brands.add("MacBook Pro 13");
			brands.add("MacBook Air");
		}
		return(brands);
	}
}

