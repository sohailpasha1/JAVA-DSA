package com;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				return new int[] { i, map.get(arr[i]) };
			map.put(k - arr[i], i);
		}
		return null;
	}
}
