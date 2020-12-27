package MyFirstPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListCollection {
	public static void main(String args[]) {
		//Create a List
		List<String> list = new ArrayList<String>();
		// Add an elements to List
		list.add("Apple");
		list.add("Cat");
		list.add("Apple");
		list.add("Ball");
		
		//Print an elements of the List
		System.out.println("List: " + list);
		
		//Retrieve element from list using Iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator: " + iterator.next());
		}
	}
}

