package com.bridgeit.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(1, "abc");//No duplicates
		System.out.println("HashMAp->"+map);

		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(1, "abc");
		map1.put(2, "Alis");
		map1.put(1, "abc");
		System.out.println("LinkedHashMap->"+map1);
	}
}
