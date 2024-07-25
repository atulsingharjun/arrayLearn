package arraylearn;

public class Exer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,8,4,9};
		int max;
		
		max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
