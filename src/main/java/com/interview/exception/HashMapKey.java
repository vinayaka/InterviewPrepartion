package com.interview.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapKey {

	public static void main(String[] args) {
		HashMap<String,List<String>> hmap=new HashMap<>();
		
		List<String> phone=new ArrayList();
		phone.add("9986087841");
		phone.add("123456789");
		
		hmap.put("vinayaka", phone);
		
		for(Entry<String,List<String>> entry:hmap.entrySet() ) {
			String name=entry.getKey();
			List<String> pnum=entry.getValue();
			System.out.println(name);
			System.out.println(pnum.toString());
		}
	}

}
