package com.me.leetcode.algo.easy;

public class ReverseString {

	public static String reverseString(String s) {

		char[] orig = s.toCharArray();
		for (int i = 0; i < s.length() / 2; i++) {
			char c = orig[i];
			orig[i] = orig[s.length() - 1 - i];
			orig[s.length() - 1 - i] = c;
		}
		return new String(orig);
	}
}
