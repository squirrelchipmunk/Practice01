package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		System.out.println("구의부피는: "+ (4.0/3.0)*PI*(r*r*r));

		sc.close();
	}

}
