package javaAssignment;

import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		System.out.println("Enter size of the Elements ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println("before sorting\n "  +arr[i]);
		}
		
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				int temp;
				if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
			System.out.println("After sorting "  +arr[i]);
			
		}
	}
}
