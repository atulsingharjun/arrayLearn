package arraylearn;

public class Exer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,2,5,0,6};
		int min  ;
		min =a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(min);

	}

}
