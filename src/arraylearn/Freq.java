package arraylearn;

public class Freq {

	public static void main(String[] args) {
		
		int a[]= {5,6,5,6,4,3};
	int key=5; int freq=0;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==key) {
			freq++;
			
		}
		
	}
	System.out.println("freq of 5  "+freq);// TODO Auto-generated method stub

	}

}
