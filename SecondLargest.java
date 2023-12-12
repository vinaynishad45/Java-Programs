package ArrayCoding;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	
		int array[]= {2,5,9,10,25,39,67,95};
		Arrays.sort(array);
		System.out.println("First largest element is : "+array[array.length-1]);
		System.out.println("Second largest element is : "+array[array.length-2]);
	}
	
	
}
