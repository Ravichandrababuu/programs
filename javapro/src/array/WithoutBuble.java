package array;

public class WithoutBuble {

	public static void main(String[] args) {

		int[] a={1,1,12,24,12,15,18,17,45,5};
		int min=a[0];int smin=Integer.MAX_VALUE;
		  for(int i=0;i<a.length;i++) {
            if(min>a[i])
			  min=a[i];
            else if(smin>a[i] && min<a[i])
            	smin=a[i];
		  }
		System.out.println(min);
		System.out.println(smin);
	}

}
