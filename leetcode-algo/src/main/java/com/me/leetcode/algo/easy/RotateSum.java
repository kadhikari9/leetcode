package com.me.leetcode.algo.easy;

/**
 * 
 * 
 * @author kusu
 *
 *         https://leetcode.com/problems/rotate-function/
 */
public class RotateSum {
	
	/**
	 * 
	 * @param A
	 * @return
	 * F0=0+1a1+2a2+3a3;
	 * F1=0+1a0+2a1+3a2=0+1a1+2a2+3a3 +1a0+1a1+1a2+1a3 -4a3=F0+sum-4a3;
	 * F2=0+1a3+2a0+3a1=0+1a1+2a2+3a3 +1a0+1a1+1a2+1a3 -4a3 +1a0+1a1+1a2+1a3 -=F1+sum-4a2
	 * F3=F2+sum-4a1;
	 */

	public static int maxRotateFunction(int[] A) {
		int F=0;
		int sum=0;
		int max=Integer.MIN_VALUE;
		
		if(A.length<=1){
			return 0;
		}
		
		for(int i=0;i<A.length;i++){
			F+=i*A[i];
			sum+=A[i];
		}
		
		if(F>max){
			max=F;
		}
		
		for(int i=1;i<A.length;i++){
			F+=sum-A.length*A[A.length-i];
			if(F>max){
				max=F;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 6 };

		System.out.println(maxRotateFunction(a));
	}

}
