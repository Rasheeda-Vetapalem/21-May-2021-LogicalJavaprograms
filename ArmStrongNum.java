package javaAssignment;

import java.util.Scanner;

public class ArmStrongNum {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int result=0;
	while(num!=0){
		
	int temp=num%10;
	result=result+temp*temp*temp;
	num=num/10;
		
	}
	if(n==result){
	System.out.println("Armstrong num");
	}
	else{
		System.out.println("not Armstrong num");
	}
}
}
