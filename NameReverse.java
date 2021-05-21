package javaAssignment;

import java.util.Scanner;

public class NameReverse {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String reverse="";
		for(int i=name.length()-1;i >= 0;i--){
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
	}

}
