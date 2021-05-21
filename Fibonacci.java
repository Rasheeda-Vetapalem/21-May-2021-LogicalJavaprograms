package javaAssignment;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int num1=0,num2=1,result=0;
	System.out.println(num1+" "+num2);
	for(int i=2;i<num;i++){
		result=num1+num2;
		System.out.println(result);
		num1=num2;
		num2=result;
		
	}
	
	}
}
