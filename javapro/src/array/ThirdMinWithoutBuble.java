package array;

public class ThirdMinWithoutBuble {

	public static void main(String[] args) {

		int a[]= {0,2,1,85,55,3,10,15,24,78,};
		int fmin=a[0],smin=Integer.MAX_VALUE,tmin=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(fmin>a[i]) {
				fmin=a[i];
			}
			else if(smin>a[i] && a[i]>fmin) {
				smin=a[i];
			}
			else if(tmin>a[i] && a[i]>smin) {
				tmin=a[i];
			}
			
		}
		System.out.println(fmin);
		System.out.println(smin);
		System.out.println(tmin);
	}

}
