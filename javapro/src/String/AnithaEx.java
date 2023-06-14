package String;

import java.util.Iterator;

public class AnithaEx {

	public static void main(String[] args) {

		String a="anitha";
		String b="ravi";
		a=a+b;
		int l=a.length()-b.length();
		b=a.substring(0,l);
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
