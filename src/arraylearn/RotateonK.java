package arraylearn;

public class RotateonK {

	public static void main(String[] args) {
		int a[]= {5,5,5,10};
		 int len =a.length;
		 int sum =0;
		 for(int i=0;i<a.length;i++) {
			 sum = sum+a[i];
		 }
		 float avg = sum/len;
		 System.out.println(avg);

	}

}
