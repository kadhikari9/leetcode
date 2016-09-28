package com.me.leetcode.algo.easy;

public class Palindrome {

	public static boolean isPalindrome(int x) {
		if (x < Integer.MIN_VALUE) {
			return false;
		}

		int orig = x;

		x = Math.abs(x);

		int sum = 0;

		while (x > 0) {
			sum = 10 * sum + x % 10;
			x /= 10;
		}

		return sum == orig;
	}

	public static int myAtoi(String str) {
		char[] chrs = str.toCharArray();
		// 1245
		int sum = 0;
		for (char c : chrs) {
			sum = sum * 10 + (c - 48);
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(myAtoi("213224"));
	}
}
