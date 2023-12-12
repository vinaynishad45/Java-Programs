package basic_programs;

public class Prime1toN {

	public static void main(String[] args) {
		 
		int temp=0;
		for(int n=11;n<=30;n++) {
			for(int i=2;i<=n-1;i++) {
				if(n%i==0) {
					temp++;
				}
			}
			if(temp==0)
				System.out.println(n);
			else
				temp=0;
		}

	}

}
