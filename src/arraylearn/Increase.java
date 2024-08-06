package arraylearn;

public class Increase {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int a[]= {8,4,6,9,11};
			int temp;
			for(int i=0;i<=a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					
					while(a[i]>a[j]) {
						temp =a[i];
						a[i]=a[j];
						a[j]=temp;
						
						
					}
				}
			}
			for(int i=0;i<a.length;i++) { 
				System.out.println(a[i]); }
		}
		// TODO Auto-generated method stub

	

}
