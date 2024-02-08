package com;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWORepeat {

	public static int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int result = 0, left = 0, right = 0;
		Set<Character> set = new HashSet<>();
		while (left < length && right < length) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right++));
				result = Math.max(result, right - left);
			} else {
				set.remove(s.charAt(left++));
			}
		}
		return result;
	}
}
