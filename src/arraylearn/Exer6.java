package arraylearn;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,8,9,5};
		int sum =0;
		
		for(int i= 0; i<=3;i++) {
			sum = a[i]+sum;
		}
		System.out.println(sum);

	}

}
