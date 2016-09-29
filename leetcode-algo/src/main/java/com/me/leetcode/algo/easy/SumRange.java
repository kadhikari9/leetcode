package com.me.leetcode.algo.easy;

/**
 * https://leetcode.com/problems/range-sum-query-immutable/
 * 
 * @author kusu
 *
 */
public class SumRange {

	int[] nums;
	int[] sums;

	public SumRange(int[] nums) {
		this.nums = nums;
		sums = new int[nums.length + 1];

		for (int k = 1; k <= nums.length; k++) {
			sums[k] = sums[k - 1] + nums[k - 1];
		}
	}

	public int sumRange(int i, int j) {
		// 1,2,3,4,5
		return sums[j + 1] - sums[i];
	}

	public static void main(String[] args) {
		int[] nums = { -2, 0, 3, -5, 2, -1 };

		SumRange sr = new SumRange(nums);
		int sum = sr.sumRange(0, 2);
		System.out.println(sum);
	}

}
