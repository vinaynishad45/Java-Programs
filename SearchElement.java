package ArrayCoding;

import java.util.Scanner;

public class SearchElement {

	static void searchElement() {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {3,7,6,19,23,40};
		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" \n");
		}
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		int result =-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number)
				result=i;
		}
		System.out.println(number+" found at " +result+" index");
	}
	public static void main(String[] args) {
		searchElement();
	}
}
