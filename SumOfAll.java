package ArrayCoding;

public class SumOfAll {

	public static void main(String[] args) {
		
		int array[]= {1,3,5,7,9,13,15,20};
		int sum = 0;
		System.out.print("Sum of all elements of Even position is : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0)
			sum+=array[i];
			
		}
		System.out.println(sum);
		System.out.print("Sum of all elements of Odd position is : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0)
			sum+=array[i];
			
		}
		System.out.println(sum);
	}
}
