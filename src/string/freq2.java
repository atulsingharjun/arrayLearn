package string;

public class freq2 {

	public static void main(String[] args) {
		String s= "absasgaadg";
		char[] ch=s.toCharArray() ;
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch[i]+" is "+count+"times");
			}
		}

	}

}
