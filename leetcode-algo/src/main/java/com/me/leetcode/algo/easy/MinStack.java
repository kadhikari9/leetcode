package com.me.leetcode.algo.easy;

/**
 * 
 * @author kusu
 * 
 *         https://leetcode.com/problems/min-stack/
 *
 */
public class MinStack {
	int[] stack = new int[10000];
	int top = -1;
	int min = Integer.MAX_VALUE;

	/** initialize your data structure here. */
	public MinStack() {

	}

	public void push(int x) {
		if (x <= min) {
			stack[++top] = min;
			min = x;
		}
		stack[++top] = x;
	}

	public void pop() {
		if (stack[top] == min) {
			top--;
			min = stack[top];
		}
		top--;
	}

	public int top() {
		return stack[top];
	}

	public int getMin() {
		return min;
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		int val=minStack.getMin(); // --> Returns -3.
		System.out.println(val);
		minStack.pop();
		int val2=minStack.top(); // --> Returns 0.
		System.out.println(val2);
		int min=minStack.getMin(); // --> Returns -2.
		System.out.println(min);
	}
}
