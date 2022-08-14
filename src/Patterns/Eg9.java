package Patterns;
						//*			rows=10, star=1,
						//**
						//***
						//****
						//*****
						//****
						//***
						//**
						//*
public class Eg9 {

	public static void main(String[] args) {
		
		int star=1;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
		

	}

}
