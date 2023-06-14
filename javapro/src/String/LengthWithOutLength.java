package String;

import java.util.ArrayList;

public class LengthWithOutLength {

	public static void main(String[] args) {

		String a="Ravi chandra babu";
		//toknow the length
		System.out.println(a.length());
		
		//1
		int count=0;
		char ch[]=a.toCharArray();
		for(Character i: ch) {
			count++;
		}
		System.out.println(count);
		
		//2
		ArrayList<Character>ar=new ArrayList<>();
        for(Character i: ch) {
        	ar.add(i);
        }
        System.out.println(ar.size());
        
	}

}
