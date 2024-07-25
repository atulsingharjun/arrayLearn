package arraylearn;

public class Exerc7 {

	public static void main(String[] args) {
		
		int a[]= {3,5,6,2,3};
		int n = 3, count=0;
		
		for (int i=0; i<=a.length;i++) {
			if(a[i]==n) {
				count++;
			}
			
		}
		if(count>0) {
			System.out.println("no is found ");
		}
		
		else {
			System.out.println("not found");
		}
		// TODO Auto-generated method stub

	}

}
