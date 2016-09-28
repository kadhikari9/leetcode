package com.me.leetcode.algo.easy;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/
 * 
 * @author kusu
 *
 */
public class ExcelSheetTitle {

	public String convertToTitleRecursive(int n) {
		if (n == 0) {
			return "";
		}
		int div, rem;
		div = (n - 1) / 26;
		rem = (n - 1) % 26;
		return convertToTitle(div) + (char) ('A' + rem);
	}

	public static String convertToTitle(int n) {

		StringBuilder sb = new StringBuilder();
		String buffer = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			int r = (n - 1) % 26;

			sb.append(buffer.charAt(r));
			n = (n - 1) / 26;
		} while (n > 0);

		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(convertToTitle(28));

	}

}
