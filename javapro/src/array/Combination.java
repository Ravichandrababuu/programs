package array;

public class Combination {

	public static void main(String[] args) {

		int a[]= {1,3,8,2,9,4};//we want combination of 11
		for(int i=0;i<a.length;i++) {
			     for(int j=0;j<a.length;j++) {
			    	 if(a[i]+a[j]==11) {
			    		 System.out.println(a[i]+"   "+a[j]+"="+(a[i]+a[j]));
			    	 }
			     }
		}
	}

}
