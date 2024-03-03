package com.jayesh.linecomp;

public class LineCompProblem {
		
	int x1;
	int x2;
	int y1;
	int y2;
	String line;
	
	void setPoints(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	double length() {
		
			return Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));	
	}
	
	public void checkEquality(LineCompProblem linecompproblem2)
	{
		
		if(this.length() == linecompproblem2.length()) {
		
			System.out.println("Both Line are Same");
		
		}
		else {
			
			System.out.println("Line are Not Same");
		
		}	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program ");
		
		LineCompProblem linecompproblem1 = new LineCompProblem();
		linecompproblem1.setPoints(20, 50, 10, 20);
		
		LineCompProblem linecompproblem2 = new LineCompProblem();
		linecompproblem2.setPoints(20, 50, 10, 20);
		
		linecompproblem1.checkEquality(linecompproblem2);
	
	}
}
