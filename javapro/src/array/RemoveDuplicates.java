package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int a[]= {5,3,1,1,4,5,6};
		
		/*int b[]=new int[a.length];int k=0;
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					flag=true;
				}
			}
			if(!flag)
				b[k++]=a[i];
		}
		System.out.println(Arrays.toString(b));*/
		
		//2
		LinkedHashSet<Integer>lh=new LinkedHashSet<>();
		 for(int i=0;i<a.length;i++) {
			 lh.add(a[i]);
		 }

		 lh.forEach(i->System.out.print(i+"  "));
	}

}
