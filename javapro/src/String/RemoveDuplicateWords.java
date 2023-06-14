package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String s="I am I am  a a Software Engineer software engineer";
		String []w=s.split(" ");
		LinkedHashSet<String>hs=new LinkedHashSet();
		
		for(int i=0;i<w.length;i++) {
			 for(int j=i+1;j<w.length;j++) {
                 if(w[i].equalsIgnoreCase(w[j]))
                	 w[j]=w[i];
			 }
             hs.add(w[i]);
		}
		System.out.println(hs);
		hs.forEach(i->System.out.print(i+" "));
		
	}

}
