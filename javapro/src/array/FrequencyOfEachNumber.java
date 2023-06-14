package array;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class FrequencyOfEachNumber {

	public static void main(String[] args) {

		int a[]= {5,3,1,1,4,5,6};
		
		/*boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			int count=0;
                 if(!b[i]) {
                	 for(int j=i+1;j<a.length;j++) {
                		 if(a[i]==a[j]) {
                			 b[j]=true;
                			 count++;
                		 }
                	 }
                     System.out.println(a[i]+"  "+count);
                 }
			
		}*/
		
		//2
		ArrayList<Integer>ar=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			  ar.add(a[i]);
		}
		boolean b[]=new boolean[a.length]; 
		for(int i=0;i<ar.size();i++) {
			int count=0;
                  if(!b[i]) {
                	  for(int j=i+1;j<ar.size();j++) {
                		    if(ar.get(i)==ar.get(j)) {
                		    	        b[j]=true;
                		    	        count++;
                		    }
                	  }
                	  System.out.println(ar.get(i)+"  "+count);
                  }
			}
		
		}
	}
