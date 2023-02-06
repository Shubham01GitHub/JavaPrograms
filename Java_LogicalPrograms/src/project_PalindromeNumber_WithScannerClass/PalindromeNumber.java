package project_PalindromeNumber_WithScannerClass;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int userNum;
		int temp;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		userNum = sc.nextInt();
		sc.close();
		
		int pal = userNum;
		
		while(userNum>0)
		{
			temp = userNum%10;
			total = total*10 + temp;
			userNum = userNum/10;
		}
		
		System.out.println("The reverse number is : " + total);
		
		if(pal == total) 
		{
			System.out.println("The given number is an Palindrome Number.");
		}
		else
		{
			System.out.println("The given number is not an Palindrome Number.");
		}
	}


}
