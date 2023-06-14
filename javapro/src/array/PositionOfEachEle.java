package array;

public class PositionOfEachEle {

	public static void main(String[] args) {

		int a[]= {5,3,1,1,4,5,6};

		boolean b[]=new boolean[a.length];int pos=1;
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(!b[i]) {
				for(int j=i+1;j<a.length;j++) {
					 if(a[i]==a[j]) {
						 b[j]=true;
						 count++;
					 }
				}
				System.out.println(a[i]+" >>> "+count+" >>>"+pos);
				pos++;
			}

		}
	}

}
