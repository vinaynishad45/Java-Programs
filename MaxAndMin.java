package ArrayCoding;

public class MaxAndMin {

	public static void main(String[] args) {
		
		int array[]= {2,6,9,13,20,25,56}; 
		int max=array[0],min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)
				min=array[i];
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("Minimum elements in the array is : "+min);
		System.out.println("Maximum elements in the array is : "+max);
	}
}
