package com.me.leetcode.algo.easy;

/**
 * 
 * @author kusu
 * 
 *         https://leetcode.com/problems/count-primes/
 *
 */
public class CountPrimes {

	public int countPrimes(int n) {

		if (n < 3) {
			return 0;
		}
		boolean[] prime = new boolean[n];
		prime[0] = false;

		for (int i = 1; i < n - 1; i++) {
			prime[i] = true;
		}

		for (int i = 2; i * i < n; i++) {
			if (!prime[i - 1]) {
				continue;
			}

			for (int j = 2 * i; j < n; j += i) {
				prime[j - 1] = false;
			}
		}
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (prime[i]) {
				c++;
			}
		}

		return c;
	}
}
