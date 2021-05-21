package javaAssignment;

import java.util.Scanner;

public class PalindromeName {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String reverse="";
		String rev=name;
		for(int i=name.length()-1;i >= 0;i--){
			reverse=reverse+name.charAt(i);
		}
		if(rev.equals(reverse)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}

}
