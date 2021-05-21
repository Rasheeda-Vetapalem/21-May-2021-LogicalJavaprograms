package javaAssignment;

import java.util.Scanner;

public class PerfectNum {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int result=0;
	for(int i=1;i<num;i++){
		
		if(num%i==0){
			result=result+i;
			System.out.println(result);
		}
	}
		
		if(n==result){
			System.out.println("Perfect num");
		}
		else{
			System.out.println("not perfect num");
		}
}
}
