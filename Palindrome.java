package basic_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check palindrome :");
		int number = sc.nextInt();
		int palNum=number;
		int rev=0;
		while(number>0) {
			rev=rev*10+number%10;
			number /=10;
		}
		if(rev==palNum)
			System.out.println("Number is Palindrome ");
		else
			System.out.println("Number is not Palindrome");
	}

}
