package com.Jan29;
import java.util.*;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		boolean isSquare = false; 
		
		for(int i = 0; i <= n; i++) {
			if(i*i == n) {
				System.out.print("perfect square");
				isSquare = true;
			}
		}
		
		if(isSquare == false) {
			System.out.print("Not a perfect square");
		}
	}
}