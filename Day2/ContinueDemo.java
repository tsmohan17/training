package com.Day2;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=5; k<15; k++)
		{
			//odd numbers skipped
			if(k%2!=0)
				continue;
			System.out.println(k+" ");
		}


	}

}
