package com.me.leetcode.algo.easy;

import java.util.HashSet;
import java.util.Set;

public class FindDifference {

	public static char findTheDifference(String s, String t) {
		Set<Character> set=new HashSet<>();
		
		for(char c: s.toCharArray()){
			set.add(c);
		}
		
		for(char sc:t.toCharArray()){
			if(!set.contains(sc)){
				return sc;
			}
		}
		
		return '0';
	}

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcde","abcdef"));
	}

}
