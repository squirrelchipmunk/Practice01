package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		System.out.println(i);
		System.out.println(n);
		// ++i에서 값이 먼저 증가하고 다른 연산이 실행되어 11%2 = 1
	}

}
