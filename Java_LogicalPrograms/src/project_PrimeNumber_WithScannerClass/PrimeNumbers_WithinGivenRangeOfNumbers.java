package project_PrimeNumber_WithScannerClass;

import java.util.Scanner;

public class PrimeNumbers_WithinGivenRangeOfNumbers
{
	public static void main(String[] args)
	{
		int from_Num;
		int to_Num;
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a from number:");
		from_Num = sc.nextInt();
		System.out.println("Enter a to number:");
		to_Num = sc.nextInt();
		sc.close();
		
		for(int i = from_Num; i<=to_Num ; i++)
		{
			for(int j = 2; j<i; j++) 
			{
				if(i%j==0) 
				{
					flag = 1;
				}
			}
			
			if(flag==0)
			{
				System.out.println(i + " is a Prime Number.");
			}
			else
			{
				flag=0;
			}
		}
	}

}
