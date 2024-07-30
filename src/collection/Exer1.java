package collection;


import java.util.ArrayList;
public class Exer1 {
	
	
	

	
	    public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<>();
	        names.add("Arjun");
	        names.add("Kumar");
	        names.add("Singh");

	        String nameToFind = "Kumar";
	        String newName = "New";

	        addNameBeforeAndAfter(nameToFind, newName, names);

	        System.out.println(names);
	    }

	    public static void addNameBeforeAndAfter(String nameToFind, String newName, ArrayList<String> array) {
	        int index = array.indexOf(nameToFind);
	        if (index != -1) {
	            array.add(index, newName); // Add new name before the found name
	            array.add(index + 2, newName); // Add new name after the found name
	        }
	    }
	

}
