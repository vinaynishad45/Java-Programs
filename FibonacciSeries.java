package basic_programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1, c;
		System.out.println("Enter any number to find factorial : ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}
}

 
