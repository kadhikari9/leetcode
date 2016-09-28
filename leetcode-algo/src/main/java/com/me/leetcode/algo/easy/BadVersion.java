package com.me.leetcode.algo.easy;

/**
 * 
 * @author kusu
 * 
 *         https://leetcode.com/problems/first-bad-version/
 *
 */
public class BadVersion {

	public static boolean isBadVersion(int version) {
		if (version < 1702766719) {
			return false;
		}
		return true;
	}

	public static long firstBadVersion(int n) {
		int bad = n;
		while (true) {
			if (!isBadVersion(n - 1) && isBadVersion(n)) {
				return n;
			}

			if (isBadVersion(n)) {
				bad = n;
				n = n / 2;
				continue;
			}

			else {
				long half = ((long) n + bad) / 2;
				n = (int) half;
			}
		}

	}

	public static long firstBadVersion2(int n) {
		int high = n;
		int low = 1;
		while (low < high) {
			int mid = low + (high - low) / 2;

			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	public static void main(String[] args) {
		System.out.println(firstBadVersion(2126753390));

	}

}
