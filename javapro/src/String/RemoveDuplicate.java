package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

	//1
		String s="Tester";
		String s1=s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet();
		for(int i=0;i<s1.length();i++) {
			hs.add(s1.charAt(i));
		}
		for(Character c: hs) {
			System.out.print(c+" ");
		}
      System.out.println();
		//2
		LinkedHashSet<Character> hs1=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			hs1.add(s.charAt(i));
		}
		for(Character c: hs1) {
			System.out.print(c+" ");
		}
		System.out.println();
	}

}
