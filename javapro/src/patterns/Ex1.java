package patterns;

public class Ex1 {

	public static void main(String[] args) {

		int n=9;
		int space=n/2;int des=1;
		for(int i=1;i<=n;i++) {
            for(int j=space;j>0;j--) {
          System.out.print("  ");
            }
            for(int j=1;j<=des;j++) {
            	System.out.print(" *");
            }
            
            if(i<=n/2) {
            	space--;
            	des=des+2;
            }
            else {
            	space++;
            	des=des-2;
            }
            System.out.println();
		}
		
		
		
	}

}
