package com.bridgeit.map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "alfred");
		map.put(2, "rosely");
		map.put(3, "alis");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("Before removal:" + map);
		map.remove(2);
		System.out.println("After removal:" + map);
	}
}
