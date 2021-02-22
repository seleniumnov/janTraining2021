package javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListEx {

	// ArrayList<Int,String,Webelement,doub> ref = new
	// ArrayList<Int,String,Webelement,doub>();

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("suresh");

		names.add("gopal");

		names.add("santosh");

		names.add("ravi");
		
		names.add("suresh");
		
		System.out.println("Original "+names);
		
		Collections.sort(names);
		
		System.out.println("After Sort "+names);
		
		
		//names.add(0, "Selenium");
		
		
		
		//String results = names.get(1);
		
		//System.out.println(results);
		
		//System.out.println(names.size());
		
		/*
		 * for(int i=0;i<names.size();i++) {
		 * 
		 * System.out.println(names.get(i)); }
		 */
		
		Set<String> setvalues = new HashSet<String>(); 
		
		setvalues.add("suresh");

		setvalues.add("gopal");

		setvalues.add("santosh");

		setvalues.add("ravi");
		
		setvalues.add("suresh");
		
		
		System.out.println(setvalues);
		
		
		Iterator<String> ite = setvalues.iterator();
		
		
		
		
		
	
		
		
		
		
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(134, "Selenium");
		
		map.put(45, "xyz");
		
		map.put(116, "Suresh");
		
		map.put(123, "Selenium");
		
		System.out.println(map);
		
		System.out.println(map.get(45));
		
		
		
	}

}
