package arraylearn;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,N,total=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a no ");
//		N=sc.nextInt()	;	
		
		for(int i=2;i<=10 ;i++) {
			count=1;
			for(int j=1;j<=i;j++) {
				
				if(i%j == 0) {  
					count++;
					
				}
				
				if(count == 2) {  //yha hm factor dikte hai ya to 1 se kate ya khud se isliye 2 ka factor ho
					System.out.println(i);
					//total=total+1;
				
				}
				
			}
			
		}
		//System.out.println("total no" +total);
	}

}
