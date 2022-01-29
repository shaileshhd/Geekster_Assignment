package com.CodeGeekster;
import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First num: ");
		int a = s.nextInt();
		System.out.println("Enter Second num: ");
		int b = s.nextInt();
		System.out.println("Enter Thrid num: ");
		int c = s.nextInt();
		
		
		int largest = 0;
		//int largest1 = (a < b)? (b < c)? c:b : (a < c)? c:a;
		
		if(a <= b) {
			if(b < c) {
				largest = c;
			} else {
				largest = b;
			}
		} else if(a >= c) {
			if(a > b) {
				largest = a;
			} else {
				largest = b;
			}
		}
		
		System.out.print("The largest number among " +a+" "+b+" "+c+" is: "+largest);
	}
}
