package arraylearn;

public class Exer13 {

	public static void main(String[] args) {
		
		
		int a[]={1,2,3,4,5,6,7};
		int d=2;
		
		for(int i=0;i<d;i++) {
			int first =a[0],j;
			for(j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
				
			}
		a[a.length-1]=first;
			
			
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i] + "");
		}

	}

}
