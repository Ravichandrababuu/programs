package array;

public class Ex1 {

	public static void main(String[] args) {

		int a[]={0,1,1,0,1};   //op=11100
		boolean flag=true;
		int f[]=new int[a.length];
 int m=0;
  int n=a.length-1;
      for(int i=0;i<a.length;i++) {
    	  if(a[i]==0) {
    		  f[n]=a[i];
    		  n--;
    	  }
    	  else {
    		f[m]=a[i];
    		m++;
    	  }
      }

		for(int i=0;i<f.length;i++){
		 System.out.print(f[i]);
		          }

	}

}
