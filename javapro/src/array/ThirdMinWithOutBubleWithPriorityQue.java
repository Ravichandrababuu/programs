package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ThirdMinWithOutBubleWithPriorityQue {

	public static void main(String[] args) {

		int a[]= {0,3,1,10,1,1,15,12,18,19,41,0};	
		
	TreeSet<Integer>ts=new TreeSet<>();
	for(int i=0;i<a.length;i++) {
	    ts.add(a[i]);
	}
  ArrayList<Integer>t=new ArrayList<>(ts);
System.out.println(t.get(0));
System.out.println(t.get(1));
System.out.println(t.get(2));

		/*ArrayList<Integer> t=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			t.add(a[i]);
		}
		Collections.sort(t);
		System.out.println(t);*/
  
	}

}
