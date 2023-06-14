package array;

public class Primenum2 {

	public static void main(String[] args) {

		int a[]= {5,7,9,11,15,21,13,2,19,10,15,18,14,22};
		for(int i=0;i<a.length;i++) {
			int count=0;
			 for(int j=1;j<=a[i];j++) {
				 if(a[i]%j==0)
					 count++;
			 }
			 if(count==2) {
				 System.out.println(a[i]);
			 }
		}
	}

}
