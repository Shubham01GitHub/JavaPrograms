package project_Factorial_WithScannerClass;

import java.util.Scanner;

public class FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		int num;
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial to be printed:");
		num = sc.nextInt();
		sc.close();		
		
		for(int i = 1; i<=num; i++) 
		{
			fact = fact*i;
		}
		
		System.out.println("The factorial of the given number is: " + fact);
		
	}

}
