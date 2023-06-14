package String;

public class FrequencyOFWords {

	public static void main(String[] args) {

		String s="I am I am a a software engineer software engineer ravi";
		String []w=s.split(" ");

		boolean b[]=new boolean[w.length];
		for(int i=0;i<w.length;i++) {
			int count=0;
			if(!b[i]) {
			for(int j=i+1;j<w.length;j++) {
				if(w[i].equalsIgnoreCase(w[j])) {
					count++;
					b[j]=true;
			}
			}
			System.out.println(w[i]+"\t"+count);
			}
		}
	
	}

}
