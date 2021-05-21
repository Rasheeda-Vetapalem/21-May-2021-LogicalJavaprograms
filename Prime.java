package javaAssignment;

import java.util.Scanner;

public class Prime {
	
	public static void isPrime(int num ){
		
		int temp=0;
		if(num==0||num==1){  
			   System.out.println(num+" is not prime number");      
			  }else{  
			   for(int i=2;i<=num/2;i++){      
			    if(num%i==0){      
			     System.out.println(num+" is not prime number");      
			     temp=1;      
			     break;      
			    }      
			   }      
			   if(temp==0) 
			   { 
				   System.out.println(num+" is prime number"); 
				   
			   }  
			  }  
			}  
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		isPrime(num);
	}

}
