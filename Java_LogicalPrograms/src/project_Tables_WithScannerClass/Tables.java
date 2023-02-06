package project_Tables_WithScannerClass;

import java.util.Scanner;

public class Tables 
{
	public static void main(String[] args) 
	{
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which table you want?" + "\n" + "Enter the number:");
		num = sc.nextInt();
		sc.close();
		
		System.out.println("The table of " + num + " is as follows:");
		
		for(int i = 1; i<=10; i++)
		{
			System.out.println(num + "*" + i + "=" + num*i);
		}
	}

}
