package com.Day2;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		int a=10,b=100,c=61;
		
		System.out.println("The largest number is:");
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else
		{
			if(c>b)
				System.out.println(c);
			else
				System.out.println(b);
		}
			
		// TODO Auto-generated method stub

	}

}
