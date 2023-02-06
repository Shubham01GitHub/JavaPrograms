package project_SmallestNumberInArray_WithScannerClass;

import java.util.Scanner;

public class FindSmallestNumberInArray 
{

	public static void main(String[] args) 
	{
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i<arr.length; i++) 
		{
			System.out.println("Enter element at index " + i + ":");
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int small = arr[0];
		
		for(int j = 0; j<arr.length; j++)
		{
			if(small>arr[j]) 
			{
				small = arr[j];
			}
		}
		
		System.out.println("The biggest number in the array is : " + small);
	}

}
