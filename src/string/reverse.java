package string;

public class reverse {

	public static void main(String[] args) {
		String s1 = "Arjun";
		
		String rev="";
		for(int i =s1.length()-1;i>=0;i--) {
			rev = rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		// TODO Auto-generated method stub

	}

}
