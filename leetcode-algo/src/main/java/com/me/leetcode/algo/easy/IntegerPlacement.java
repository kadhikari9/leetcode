package com.me.leetcode.algo.easy;

/**
 * 
 * @author kusu
 * 
 *         https://leetcode.com/problems/integer-replacement/
 *
 */
public class IntegerPlacement {

	public static int integerReplacement(int n) {
		if (n == Integer.MAX_VALUE) {
			return 32;
		}
		int c = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				int x = (n + 1) / 2;
				if (x % 2 == 0 && n != 3) {
					n = n + 1;
				} else {
					n = n - 1;
				}
			}
			c++;
		}

		return c;
	}

	public static void main(String[] args) {
		System.out.println(integerReplacement(8));
	}

}
