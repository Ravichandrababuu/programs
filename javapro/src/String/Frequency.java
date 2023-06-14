package String;

import java.util.LinkedHashSet;

public class Frequency {

	public static void main(String[] args) {

		String s="Tester";
		char ch[]=s.toLowerCase().toCharArray();
 LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			hs.add(ch[i]);
		}
		for(Character c: hs) {
			int count=0;
			    for(int i=0;i<ch.length;i++) {
			    	if(c==ch[i])
			    		count++;
			    }
			  System.out.print(c+"  "+count+"     ");  
		}

	}

}
