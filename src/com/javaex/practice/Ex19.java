package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		final long VELOCITY_OF_LIGHT=300000;   
		Scanner sc = new Scanner(System.in);
		long YearDistance = VELOCITY_OF_LIGHT*60*60*24*365;
				//1년 -- > 30만 * 초 * 60 * 60 * 24 --> 1일 * 365
		
		System.out.println("빛이 1년 동안 가는 거리는 "+YearDistance+" km 입니다.");
		
		
		sc.close();
	}

}
