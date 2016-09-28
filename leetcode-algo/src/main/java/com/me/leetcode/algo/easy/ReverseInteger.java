package com.me.leetcode.algo.easy;

/**
 * 
 * @author kusu
 *
 *         https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

	public static int reverse(int x) {
		long sum = 0;
		int mul = x < 0 ? -1 : 1;
		x = Math.abs(x);

		while (x > 0) {
			int r = x % 10;
			sum = sum * 10 + r;
			if (sum > Integer.MAX_VALUE) {
				return 0;
			}
			x = x / 10;
		}

		return (int) sum * mul;
	}

	public static void main(String[] args) {
		System.out.println(reverse(12345));
	}

}
