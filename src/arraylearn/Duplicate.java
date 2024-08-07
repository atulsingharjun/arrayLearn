package arraylearn;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {7,4,7,8,3,4,8};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate"+a[i]);
				}
			}
		}
		
	}

}
