package basicprogram;

public class armastrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153 is armastrong -1^3*5^3*3^3    =153
		int N =153;
		int t1=N;
		int len=0;
		while(t1!=0) {
			t1=t1/10;
			len=len+1;//find the length of no 
		}
		
		//System.out.println(len);
		double arm =0;
		int t2=N;
		double rem;
		
	while(t2!=0) {
		
		
		rem = t2%10;
		//arm =arm+Math.pow(rem,len);
		arm=arm+Math.pow( rem,len);
		t2=t2/10;
		//
//		int mul=1;
//		rem = t2%10;
//		for(int i=1;i<=len;i++) {
//			mul=rem*mul;	
//		}
//		arm =arm+mul;
//		t2=t2/10;
		
		
	}
	//System.out.println(t2);
	

 if(arm==N) {System.out.println("arm");
		
	}
	}
}
