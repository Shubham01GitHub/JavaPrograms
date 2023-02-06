package project_PalindromeString_WithScannerClass;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
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
		
		System.out.println("The reverse string is : " + rev);
		
		if(userStr.equalsIgnoreCase(rev)) 
		{
			System.out.println("The given string is an Palindrome String.");
		}
		else 
		{
			System.out.println("The given string is not an Palindrome String.");
		}
	}

}
