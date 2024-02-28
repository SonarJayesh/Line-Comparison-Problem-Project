package com.jayesh.linecomp;

import java.util.Scanner;

public class LineCompProblem {

	public static void main(String[] args) {
		
		int x1;
		int x2;
		int y1 = 0;
		int y2;
		double length;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program ");
		
		System.out.println("Enter the X1,Y1 and X2,Y2 points for the Line:");
		
		x1 = scanner.nextInt();
		y2 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of Line = "+length);
		
	}

}
