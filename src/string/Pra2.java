package string;

public class Pra2 {

	public static void main(String[] args) {
		
		//revrese of string
		int l;
		String str ="hello";
		String rev ="";
		char ch;
		l =str.length(); 
		for(int i=l-1;i>=0;i--) {
			
			rev = rev +str.charAt(i);
		}
		System.out.println(rev);

	}

}
