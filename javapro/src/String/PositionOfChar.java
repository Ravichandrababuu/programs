package String;

import java.util.LinkedHashSet;

public class PositionOfChar {

	public static void main(String[] args) {

		String s="Tester";
		char ch[]=s.toLowerCase().toCharArray();
		LinkedHashSet<Character>hs=new LinkedHashSet<>();
		 for(int i=0;i<ch.length;i++) {
			 hs.add(ch[i]);
		 }
		 hs.forEach(i->System.out.print(i));
		 System.out.println();
		for(Character c: hs) {
			System.out.print(c+" "+s.lastIndexOf(c)+"   ");
		}
		
		
	}

}
