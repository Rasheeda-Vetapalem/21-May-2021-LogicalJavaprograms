package javaAssignment;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int fact=1;
		for(int i=number;i>=1;i--){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
