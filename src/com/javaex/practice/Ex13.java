package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		final double EXCHANGE_RATE = 1230.95;
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요 : ");
		int won = sc.nextInt();
		System.out.println("받으실 달러는 "+won/EXCHANGE_RATE);
		
		sc.close();
	}

}
