package project_FibonacciSeries_WithScannerClass;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int num;
		int a = 0;
		int b = 1;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		sc.close();
		
		System.out.print(a + " " + b);
		
		while(c<num) 
		{
			c = a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}

	}

}
