package arraylearn;

import java.util.ArrayList;
import java.util.List;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to insert an element into the array list at the first position.
List <String> st = new ArrayList<String>();
st.add("A");
st.add("B");
st.add("C");

System.out.println("first time" +st);

st.add(0,"Z");

System.out.println("on adding first " +st);
		
		
	}

}
