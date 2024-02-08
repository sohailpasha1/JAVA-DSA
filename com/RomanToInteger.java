package com;

import java.util.HashMap;

class RomanToInteger {

	public static int romanToInt(String s) {
		char[] cs = s.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<>();
		hs.put('I', 1);
		hs.put('V', 5);
		hs.put('X', 10);
		hs.put('L', 50);
		hs.put('C', 100);
		hs.put('D', 500);
		hs.put('M', 1000);
		int res = 0;

		for (int i = 0; i < cs.length; i++) {
			if (i + 1 < cs.length && hs.get(cs[i]) < hs.get(cs[i + 1])) {
				res -= hs.get(cs[i]);
			} else {
				res += hs.get(cs[i]);
			}
		}

		return res;
	}
}
