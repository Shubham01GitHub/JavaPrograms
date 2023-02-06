package project_ArmstrongNumber_WithScannerClass;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int userNum;
		int temp;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number:");
		userNum = sc.nextInt();
		sc.close();

		int arms = userNum;
		
		if(userNum>=100 && userNum<=999) 
		{
		while(userNum>0) 
		{
			temp = userNum%10;
			total = total + temp*temp*temp;		// for 3 digit numbers 
			userNum = userNum/10;
		}
		}
		else if(userNum>=1000 && userNum<=9999) 
		{
		while(userNum>0) 
		{
			temp = userNum%10;
			total = total + temp*temp*temp*temp;		// for 4 digit numbers 
			userNum = userNum/10;
		}
		}
		else if(userNum>=10000 && userNum<=99999) 
		{
		while(userNum>0) 
		{
			temp = userNum%10;
			total = total + temp*temp*temp*temp*temp;	// for 5 digit numbers
			userNum = userNum/10;
		}
		}

		System.out.println("Total of the given number is : " + total);

		if(arms == total) 
		{
			System.out.println("The given number is an Armstrong Number.");
		}
		else
		{
			System.out.println("The given number is not an Armstrong Number.");
		}

	}

}
