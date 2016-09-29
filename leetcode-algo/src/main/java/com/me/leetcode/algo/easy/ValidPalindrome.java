package com.me.leetcode.algo.easy;

/**
 * 
 * @author kusu
 * 
 *         https://leetcode.com/problems/valid-palindrome/
 *
 */
public class ValidPalindrome {

	public static boolean isAlpha(char c) {
		return Character.isDigit(c) || Character.isLetter(c);
	}

	public static boolean isPalindrome(String s) {
		char[] arr = s.toCharArray();
		int len=arr.length;
		
		int start = 0;
		int end = s.length() - 1;
		int mid = s.length() / 2;

		for (int i = 0; i < mid; i++) {
			while (start < len && !isAlpha(arr[start])) {
				start++;
			}

			while (end >= 0 && !isAlpha(arr[end])) {
				end--;
			}

			if (start > end) {
				return true;
			}
			
			System.out.println(arr[start]+"+ "+arr[end]);

			if (Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[end])) {
				return false;
			} else {
				start++;
				end--;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a  canal: Panama"));
	//	System.out.println(isPalindrome("0P"));
	}

}
