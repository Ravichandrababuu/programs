package String;

public class ReverseWithSpace {

	public static void main(String[] args) {


		String s="I am a Software Engineer";
		char ch[]=s.toCharArray();
		char r[]=new char[ch.length];
		for(int i=0;i<ch.length;i++) {
             if(ch[i]==' ')
            	 r[i]=ch[i];
		}
		
		int j=r.length-1;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				if(r[j]==' ') {
					j--;
				}
				r[j--]=ch[i];
			}
		}

		s=new String(r);
		System.out.println(s);
	}

}
