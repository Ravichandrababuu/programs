package String;

public class SumOfDigitsInAString {

	public static void main(String[] args) {


		String s="za111d111ja78a100";
		char ch[]=s.toCharArray();
		 int tsum=0;int sumofw=0;
		  for(int i=0;i<ch.length;i++) {
			  if(ch[i]>='0' && ch[i]<='9') {
				  sumofw=sumofw*10+ch[i]-48;
			  }
			  else  {
				  tsum=tsum+sumofw;
				  sumofw=0;
			  }
		  }
		  tsum=tsum+sumofw;
System.out.println(tsum);
	}

}
