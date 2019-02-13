package com.example.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.example.util.Props;

public class App {
	public static Map<Character,List<Integer>> indexMap = null;
	
	public static void main(String[] args) {
		String testString = Props.getHashmapString();
		indexMap = new HashMap<>();
		List<Integer> indexList = null;
		for (int i = 0, size=testString.length(); i<size; i++) {
			char alph = testString.charAt(i);
			if(indexMap.containsKey(alph)) {
				indexList = indexMap.get(alph);
				indexList.add(i);
			}
			else {
				indexList = new LinkedList<>();
				indexList.add(i);
				indexMap.put(alph, indexList);
			}
		}
		
		System.out.println("Added : " + indexMap);
	}
}
