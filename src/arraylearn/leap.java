package arraylearn;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2001;
		
		if(((year  % 400 == 0 ) && (year % 100 !=0)) || (year % 4 == 0)){
			System.out.println("yes");
			
		}else {
			System.out.println("no");
		}

	}

}
