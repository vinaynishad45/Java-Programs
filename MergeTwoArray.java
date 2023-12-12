package ArrayCoding;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,4,6,3,8};
		int b[]= {2,5,7,9,12};
		int c[]=new int[a.length+b.length];
		int index=a.length;
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		for(int j=0;j<b.length;j++)
		{
			c[index]=b[j];
		index++;
		}
		// sort method for sorting array elements
		Arrays.sort(c);
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}
	}
}
