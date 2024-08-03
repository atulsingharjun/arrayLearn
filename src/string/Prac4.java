package string;

public class Prac4 {
//replace special character
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "#$%^yeru**()";
		String rem = str.replaceAll("[^a-zA-Z0-9]", "");
				System.out.println(rem);
	}

}
