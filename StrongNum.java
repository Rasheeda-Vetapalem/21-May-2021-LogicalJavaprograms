package javaAssignment;

import java.util.Scanner;

public class StrongNum {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int flag;
	int  n=num;
	int armstrong = 0;
	while(num!=0){
		int fact=1;
		flag=num%10;
		for(int i=flag;i>=1;i--){
			 fact=fact*i;
		}
		armstrong=armstrong+fact;
		num=num/10;
	}
if(armstrong==n){

System.out.println("strong num is"+armstrong);
}

else{
	System.out.println("not srmstrong num");
}

}

}
