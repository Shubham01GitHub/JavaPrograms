package project_ReverseString_WithScannerClass;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String userStr;
		String rev = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		userStr = sc.nextLine();
		sc.close();
		
		for(int i = userStr.length()-1 ; i>=0; i--) 
		{
			rev = rev + userStr.charAt(i);
			
		}
		
		System.out.print("The reverse string is : " + rev);

	}

}
