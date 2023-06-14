package patterns;

public class TriangleEx1 {

	public static void main(String[] args) {
 
		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}
	}

}
