package String;

import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {

		String s="I am a Software Enginner";

		String s1[]=s.split(" ");
          String temp=s1[0];
          s1[0]=s1[s1.length-1];
          s1[s1.length-1]=temp;
          String t=String.join(" ", s1);
          System.out.println(t);
	}

}
