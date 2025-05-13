package com.tnsif.collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//demo for map interface
//HashMap, linkedHashMap, TreeMap
public class MapDemo {
	public static void main(String[]args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("AI", 69);
		m.put("ML", 58);
		m.put("OS", 67);
		m.put("CC", 65);
		m.put("NLP", 59);
		//no duplications ,not follow insertion order
		System.out.println("Subject      Marks");
		//for(String n:m)
		//{sop(n)}
		for(Map.Entry<String, Integer> entry:m.entrySet()) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		
		//LinkedHashMap
		Map<String,Integer> lm=new LinkedHashMap<String,Integer>();
		lm.put("AI", 64);
		lm.put("ML", 58);
		lm.put("OS", 67);
		lm.put("CC", 65);
		lm.put("NLP", 59);
		//no duplicates, follow insertion order
		System.out.println("output for LinkedHashMap:");
		for(Map.Entry<String, Integer> entry:lm.entrySet()) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		
		//TreeMap
		Map<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("AI", 64);
		tm.put("ML", 58);
		tm.put("OS", 67);
		tm.put("CC", 65);
		tm.put("NLP", 59);
		//no duplicates, follow natural sorting order
		System.out.println("output for TreeMap:");
		for(Map.Entry<String, Integer> entry:tm.entrySet()) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		
		
	}

}
