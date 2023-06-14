package String;

import java.util.LinkedHashMap;

public class NumberOfOve {

	public static void main(String[] args) {


		String s="bangalore";
	
		LinkedHashMap<Character, Integer>lhm=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			int count=0;
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
				count++;
				lhm.put(s.charAt(i), count);
			}
		}
		for(Character i: lhm.keySet()) {
			System.out.println(i+"  "+lhm.get(i));
		}
	}

}
