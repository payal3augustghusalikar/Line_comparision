package com.bridgelabz.lineComparision;

import java.util.Scanner;
import java.lang.Math.*;

public class ComputeLength {
	double[] a = new double[2];
	
	void findLength() {
		
		Scanner sc=new Scanner(System.in);
		int x1,x2,y1,y2; 
		double lengthOfLine;
		int count=1, loop;
		System.out.println("Enter count of lines to find length");
		
		loop=sc.nextInt();
		while (count<loop) {
			for(int i=0; i<loop; i++) 
			 {
		
				System.out.println("enter the points for  line " + count );	
				System.out.println("enter x1 point");
				x1=sc.nextInt();

				System.out.println("enter y1 point");
				y1=sc.nextInt();	
			
				System.out.println("enter x2point");
				x2=sc.nextInt();

				System.out.println("enter y2 point");
				y2=sc.nextInt();
				
				lengthOfLine=Math.sqrt((x2-x1)^2+(y2-y1)^2);
				System.out.println("length of line " + count + " is "+ "("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+ lengthOfLine);
				count++;
				
				a[i] = lengthOfLine; 
					
			}
		}  
	}
	
	void equalLength() { 
		Double line1 = a[0];
		Double line2 = a[1];
		if (line1.equals(line2)==true) 
			System.out.println("lines have equal length");
		else
			System.out.println("Lines do not have equal length");	
	}
	
	void compareLength() {
		Double line1 = a[0];
		Double line2 = a[1];

		int compare=line1.compareTo(line2); {
			
		       if(compare==0)
		    	   System.out.println("both lines have equal length");
		       else if(compare>0)
		    	   System.out.println("Line1 is greater than line2");
		       else
		    	   System.out.println("Line2 is greater than line1");
		}
		   
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line comparision Computation");
		ComputeLength length = new ComputeLength();
		length.findLength();
		length.equalLength();
		length.compareLength();
	}		
}
		/*for (int i=0; i<a.length; i++)
		{*/
		/*	System.out.println(a[index]);*/
		/*}*/
	
