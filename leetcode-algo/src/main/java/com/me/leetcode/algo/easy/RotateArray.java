package com.me.leetcode.algo.easy;

import java.util.Arrays;

/**
 * @author kusu
 * 
 *         https://leetcode.com/problems/rotate-array/
 * 
 */
public class RotateArray {

	// O(k) memory and O(n) time
	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		int[] temp = new int[k];
		for (int i = 0; i < k; i++) {
			temp[k - i - 1] = nums[nums.length - i - 1];
		}

		int t = nums.length - k;
		for (int i = t - 1; i >= 0; i--) {
			nums[i + k] = nums[i];
		}
		for (int i = 0; i < k; i++) {
			nums[i] = temp[i];
		}

	}

	public static void reverseArray(int[] nums, int k, int start) {
		int t = k / 2 + start;
		int c = 0;
		for (int i = start; i < t; i++) {
			int tmp = nums[i];
			int index = start + k - c - 1;
			nums[i] = nums[index];
			nums[index] = tmp;
			c++;
		}
	}

	// O(n) time and O(1) memory
	public static void rotateO1(int[] nums, int k) {
		k = k % nums.length;

		// reverse whole array
		reverseArray(nums, nums.length, 0);

		// reverse the first part
		reverseArray(nums, k, 0);

		// reverse the second part
		reverseArray(nums, nums.length - k, k);

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		// rotate(nums, 3);
		rotateO1(nums, 3);

		System.out.println(Arrays.toString(nums));
	}

}
