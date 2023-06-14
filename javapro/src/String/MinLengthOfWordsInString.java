package String;

import java.util.Arrays;

public class MinLengthOfWordsInString {

	public static void main(String[] args) {


		String s="zadeja am very bad fellow ab";
		String w[]=s.split(" ");
boolean flag=true;
   while(flag) {
	   flag=false;
		for(int i=0;i<w.length-1;i++) {
	    	  if(w[i].charAt(0)>w[i+1].charAt(0)) {
	    		  String temp=w[i];
	    		  w[i]=w[i+1];
	    		  w[i+1]=temp;
		           flag=true;
	                   }
		}
              }
   String s1=String.join(" ", w);
   System.out.println(s1);
   
	}
}
