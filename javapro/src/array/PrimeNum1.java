package array;

public class PrimeNum1 {

	public static void main(String[] args) {

		for(int i=0;i<=100;i++) {
			boolean b=isPrime(i);
			if(b)
				System.out.println(i);
		}
			
	}
	public static boolean isPrime(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
