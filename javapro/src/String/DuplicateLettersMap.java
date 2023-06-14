package String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateLettersMap {

	public static void main(String[] args) {

		String s="testyantra";
		LinkedHashMap<Character, Integer>lhm=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			lhm.put(s.charAt(i), i);
		}
		//System.out.println(lhm);
		for(Entry<Character, Integer> i :lhm.entrySet()) {
			int count=0;
			 for(int j=0;j<s.length();j++) {
				if(i.getKey().equals(s.charAt(j)))
					count++;
			 }
			 if(count>=1)
			 System.out.println(i.getKey()+"  "+count);
		}
	}

}
