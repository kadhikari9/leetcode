package com.me.leetcode.algo.easy;

/**
 * https://leetcode.com/problems/implement-strstr/
 * 
 * @author kusu
 *
 */
public class HayStack {

	public static int strStr(String haystack, String needle) {

		if (needle.isEmpty()) {
			return 0;
		}

		char[] ch = haystack.toCharArray();

		for (int i = 0; i <= ch.length - needle.length(); i++) {
			if (ch[i] == needle.charAt(0)) {
				if (haystack.substring(i, i + needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(strStr("a", "a"));
	}

}
