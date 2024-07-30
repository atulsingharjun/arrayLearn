package arraylearn;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
        int N=10;
       
        
        for(int i=1;i<=N;i++) {
            int count=0;
            for(int j=1;j<=i;j++) {
                
                if(i%j==0) 
                count++;
                
                
                   
                }
            if(count==2) {
                   
                   System.out.println(i);
               } 
            }
       
            
        }
       

}
