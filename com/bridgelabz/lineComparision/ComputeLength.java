package com.bridgelabz.lineComparision;

import java.util.Scanner;
import java.lang.Math.*;

public class ComputeLength {
	


	public static void main(String[] args) {
		System.out.println("Welcome to Line comparision Computation");
		int x1,x2,y1,y2; 
	    double lengthOfLine;

	    Scanner sc=new Scanner(System.in);

	    System.out.println("enter x1 point");

	        x1=sc.nextInt();

	        System.out.println("enter y1 point");

	        y1=sc.nextInt();

	    System.out.println("enter x2point");

	        x2=sc.nextInt();

	    System.out.println("enter y2 point");

	        y2=sc.nextInt();
		    
	lengthOfLine=Math.sqrt((x2-x1)^2+(y2-y1)^2);
	System.out.println("length of line is"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+ lengthOfLine);
		/*
		 * ComputeLength line = new ComputeLength(); line.ComputeLength();
		 */
	}

	/*
	 * private static double sqrt(int i) { // TODO Auto-generated method stub return
	 * 0; }
	 */

}
