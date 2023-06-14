package String;

public class Ex1 {

	public static void main(String[] args) {

		//1 Software
		 String s="Software";
		 char[] c=s.toCharArray();
		 int m=c.length-1;
		 for(int i=0;i<c.length;i++) {
			 if(i<m) {
				 char temp=c[i];
				  c[i]=c[m];
				  c[m]=temp;
				  m--;
			 }
		 }
		 s=new String(c);
		System.out.println(s);
		
		//2 
		String s1="Software";
		String r="";
		 int m1=c.length-1;
		 for(int i=0;i<s1.length();i++) {
			 r=r+s1.charAt(m1);
			 m1--;
		 }
		 System.out.println(r);
		 
			//3 Software
		String s2="Software";
		//int m3=s2.length()-1;
		for(int i=s2.length()-1;i>=0;i--) {
			System.out.print(s2.charAt(i));
		}
           System.out.println();
           
           //4
           String s3="Software";
            char[] ch1=s3.toCharArray();
             for(int i=ch1.length-1;i>=0;i--) {
            	 System.out.print(s3.charAt(i));
             }
		 System.out.println();
		 
		 //5
		 StringBuilder s4=new StringBuilder("Software");
		  System.out.println(s4.reverse());
	}

}
