package arraylearn;

public class Largest {

	public static void main(String[] args) {
		
		int a[]= {6,3,9,24};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	

}
