package String;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		String s="I am Fine";
		char ch[]=s.toCharArray();
		String s1[]=s.split(" ");
		int l=s1.length-1;
		 for(int i=0;i<s1.length;i++) {
			 if(i<l) {
			 String temp=s1[l];
			 s1[l]=s1[i];
			 s1[i]=temp;
			 l--;
		 }
		 }
		String t=String.join(" ", s1);
		System.out.println(t);
	}

}
