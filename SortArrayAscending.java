package ArrayCoding;

public class SortArrayAscending {

	public static void main(String[] args) {
		
		int array[]= {2,5,3,7,4,9,6,16,12,18,15};
		System.out.println("Original array is : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\nAfter sorting array in ascending order is : ");
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
