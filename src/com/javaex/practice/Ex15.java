package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		final double MILE = 1.609;	
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하세요 : ");
		double inputMile = sc.nextDouble();
		System.out.println(inputMile+"마일은 "+inputMile*MILE+"킬로미터 입니다.");
		
		sc.close();

	}

}
