package arraylearn;

public class Exer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,5,7,-1};
		int i ,j;
		int N=6;
		int total=0;
		
		for( i=0;i<=a.length;i++) {
			
			for (j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==N) {
					
					System.out.println(a[i]+"+" +a[j]+"=" +N);
					total=total+1;
				}
			}
			
			
		}
		System.out.println(total);
	}

}
