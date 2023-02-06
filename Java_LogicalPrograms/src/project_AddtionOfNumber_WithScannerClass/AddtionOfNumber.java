package project_AddtionOfNumber_WithScannerClass;

import java.util.Scanner;

public class AddtionOfNumber
{
	public static void main(String[] args)
	{
		int userNum;
		int temp;
		int add = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		userNum = sc.nextInt();
		sc.close();
		
		while(userNum>0) 
		{
			 temp = userNum%10;
			 add = add + temp;
			 userNum = userNum/10;
		}
		
		System.out.println("The addition of the given number is : " + add);

	}

}
