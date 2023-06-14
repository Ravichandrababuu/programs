package String;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		for(;;) {
			System.out.println("Enter the String to check palidrom or not");
			String n=sc.next();
			char ch[]=n.toCharArray();
			String rev="";
			 for(int i=ch.length-1;i>=0;i--) {
				 rev=rev+ch[i];
			 }
			
			if(rev.equals(n))
				System.out.println("it is a palindrom");
			else
				System.out.println("not a pali");
		}

	}

}
