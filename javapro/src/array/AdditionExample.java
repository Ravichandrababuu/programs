package array;

import java.util.LinkedHashMap;

public class AdditionExample {

	public static void main(String[] args) {


		int n=15;
		int a[]= {10,5,5,10,6,9};
		LinkedHashMap<Integer, Integer>hm=new LinkedHashMap<>();
		for(int i=0;i<a.length-1;i++) {
			          for(int j=i+1;j<a.length;j++) {
			        	  if(a[i]+a[j]==n) {
			        		  if(!hm.containsKey(a[i]) && !hm.containsValue(a[i]))
			        		  hm.put(a[i], a[j]);
			        	  }
			          }
		}
		for(Integer i: hm.keySet()) {
			System.out.println(i+"   "+hm.get(i));
		}
		
		
	}

}
