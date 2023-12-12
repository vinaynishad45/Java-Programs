package ArrayCoding;

public class ReverseArray {

	public static void main(String[] args) {
		
		int array[]= {2,5,8,12,15,4,8};
		
		
		System.out.println("Original array is : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\nReversed array is : ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		
		
		
	}
}
