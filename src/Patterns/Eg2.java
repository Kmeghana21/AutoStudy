						//*****
						//****
						//***
						//**
						//*
package Patterns;

import java.util.Scanner;

public class Eg2 
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your Choice Pattern No.");
//		int row=sc.nextInt();
//		int cols=sc.nextInt();		
//		System.out.println("Your Pattern No Row: "+row+" Cols: "+cols);
//		
//	
		
//		for(int i=1;i<=row;i++)
//		{
//			for(int j=1;j<=cols;j++)
//			{
//				System.out.print("*");
//			}
//			cols--;
//			System.out.println();
//			
//		}
		int star=5;

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
	}

}

