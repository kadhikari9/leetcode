package com.me.leetcode.algo.easy;

/**
 * 
 * @author kusu
 *
 *         https://leetcode.com/problems/add-binary/
 */
public class AddBinary {

	public static String addBinary(String a, String b) {

		StringBuilder sb = new StringBuilder();

		int e1 = a.length() - 1;
		int e2 = b.length() - 1;
		int carry = 0;
		int va, vb;

		while (e1 >= 0 || e2 >= 0) {
			va = 0;
			vb = 0;

			if (e1 >= 0) {
				va = a.charAt(e1) == '0' ? 0 : 1;
				e1--;
			}

			if (e2 >= 0) {
				vb = b.charAt(e2) == '0' ? 0 : 1;
				e2--;
			}

			int sum = va + vb + carry;
			if (sum >= 2) {
				sb.append(String.valueOf(sum - 2));
				carry = 1;
			} else {
				sb.append(String.valueOf(sum));
				carry = 0;
			}
		}

		if (carry == 1) {
			sb.append("1");
		}

		return sb.reverse().toString();

	}

	public static void main(String[] args) {
		System.out.println(addBinary("11", "11"));

	}

}
