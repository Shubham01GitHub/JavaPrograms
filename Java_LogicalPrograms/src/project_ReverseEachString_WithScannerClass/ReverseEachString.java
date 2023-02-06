package project_ReverseEachString_WithScannerClass;

import java.util.Scanner;

public class ReverseEachString 
{
	public static void main(String[] args) 
	{
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str = sc.nextLine();
		sc.close();
		
		String word[] = str.split(" ");
		
		for(String element : word) 
		{
			for(int i = element.length()-1; i>=0; i--)
			{
				char c = element.charAt(i);
				System.out.print(c);
			}
			
			System.out.print(" ");
		}
	}

}
