package basic_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime : ");
		
		int number = sc.nextInt();
		int temp=0;
		for(int i=2;i<number;i++) {
			if(number%i==0)
				temp++;
		}
		if(temp==0)
			System.out.println(number + " is Prime Number");
		else
			System.out.println(number + " is not Prime Number ");
		
	}
}

 
