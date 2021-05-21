package javaAssignment;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0;
		while(num!=0){
			
		int temp=num%10;
		reverse=reverse*10+temp;
		num=num/10;
			
		}
		System.out.println("Reverse of the number is"+reverse);
	}
}
