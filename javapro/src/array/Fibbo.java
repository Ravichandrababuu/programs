package array;

public class Fibbo {

	public static void main(String[] args) {

 int n=100;
		int f1=0;int f2=1;
		while(f1<=n) {
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}

}
