package arraylearn;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {7,4,8,9,5};
		int key=9;
		int flag=0;
		int i;
		for( i =0;i<a.length;i++) {
			if(a[i]==key) {
				 flag = 1;
	                break;
			}else {
				flag=0;
			}
			
			
		}
		
		if(flag==1) {
			System.out.println("Element found at position:"+(i + 1));
		}
	}

}
