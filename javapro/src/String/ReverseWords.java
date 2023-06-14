package String;

public class ReverseWords {

	public static void main(String[] args) {


		String s="I am a Software Engineer";
		String[] words=s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			 char ch[]=words[i].toCharArray();
			  int l=ch.length-1;
			       for(int j=0;j<ch.length;j++) {
			    	    if(j<l) {
			    	    	char temp=ch[j];
			    	    	ch[j]=ch[l];
			    	    	ch[l]=temp;
			    	    	l--;
			    	    }
			       }
			       words[i]=new String(ch);
		}
		String s1=String.join(" ", words);
		System.out.println(s1);
	}

}
