package arraylearn;

public class Freq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,4,7,8,3,4,8};
		for(int i=0;i<a.length;i++	) {	
			int x=a[i];
			int count =0;
			for(int j=0;j<a.length;j++) {
				if(a[j]==x) {
					count++;
				}
			}
			System.out.println("freq of "+x+ "is" +count);
		}

	}

}
