package com.interview.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PutPeopleInArray {

	public static void main(String[] args) {
		People p1 = new People();
		p1.setName("Shiva");
		p1.setAge(30);

		People p2 = new People();

		p2.setName("vinayaka");
		p2.setAge(39);

		People p3 = new People();

		p3.setName("Joshi");
		p3.setAge(40);

		List<People> namelist = new ArrayList();
		namelist.add(p1);
		namelist.add(p2);
		namelist.add(p3);

		for (int i = 0; i < namelist.size(); i++) {
			System.out.println(namelist.get(i));
		}

		Map<String, List<People>> peoplemap=new HashMap();
		
		peoplemap.put("peoplelist", namelist);
		
		List<People> retriveList=peoplemap.get("peoplelist");
		if(retriveList!=null) {
			for(People p:retriveList) {
				System.out.println("Name"+p.getName()+"Age"+p.getAge());
			}
		}
		
	}

}
