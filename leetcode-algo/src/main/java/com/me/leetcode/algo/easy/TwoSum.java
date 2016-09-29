package com.me.leetcode.algo.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * @author kusu
 * 
 *         https://leetcode.com/problems/two-sum/
 *
 */
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		java.util.Map<Integer, Integer> map = new HashMap<>();

		for (int j = 0; j < nums.length; j++) {

			if (map.containsKey(target - nums[j])) {
				return new int[] { map.get(target - nums[j]), j };
			} else {
				map.put(nums[j], j);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };

		int[] sum = twoSum(nums, 6);

		System.out.println(Arrays.toString(sum));

	}

}
