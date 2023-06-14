package array;

public class MockEx {

	public static void main(String[] args) {

		int count=0;
		for(int i=0;i<102;i++) {
			int b=isPrime(i);
			if(b==2)
				count++;
		}
		System.out.println("Total number of PrimeNumbers="+count);
	}
	public static int isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
if(n%i==0)
	c++;
		}
		return c;
	}

}
