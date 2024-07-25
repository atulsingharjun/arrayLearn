package arraylearn;

import java.util.ArrayList;
import java.util.List;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to remove the third element from an array list.
		
		List <String> st= new ArrayList<String>();
		st.add("A");
		st.add("B");
		st.add("C");
		
		System.out.println(st);
		
		st.remove(2);
		System.out.println(st);

	}

}
