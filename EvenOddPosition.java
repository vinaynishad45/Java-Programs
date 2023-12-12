package ArrayCoding;

public class EvenOddPosition {

	public static void main(String[] args) {
		
		int array[]= {2,4,6,7,10,26,23,13,9,15};
		
		System.out.println("Even position array elements  are : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
		
		System.out.println("\nOdd position array elements  are : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				System.out.print(array[i]+" ");
			}
			
		}
		 
	}
}
