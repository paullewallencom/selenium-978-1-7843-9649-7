package MyFirstPackage;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollection {
	public static void main(String args[]) {
		//Create a set
		SortedSet<String> sortSet = new TreeSet<String>();
		// Add an elements to set
		sortSet.add("Apple");
		sortSet.add("Cat");
		sortSet.add("Apple");
		sortSet.add("Ball");
		
		//Print an elements of the Set
		System.out.println("UniqueSet: " + sortSet);
		
		//Retrieve element from set using Iterator
		Iterator<String> iterator = sortSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator: " + iterator.next());
		}
	}
}
