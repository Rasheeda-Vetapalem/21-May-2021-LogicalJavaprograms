package javaAssignment;

import java.util.Scanner;

public class SmallArray {

	public static void main(String[] args) {
		System.out.println("Enter the Array elements");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				arr[i]=min;
			}
		}
		System.out.println("Minimum elements is"+min);
		
		
	}

}
