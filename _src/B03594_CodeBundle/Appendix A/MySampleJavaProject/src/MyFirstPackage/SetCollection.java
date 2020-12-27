package MyFirstPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
	public static void main(String args[]) {
		//Create a set
		Set<String> uniqueSet = new HashSet<String>();
		// Add an elements to set
		uniqueSet.add("Apple");
		uniqueSet.add("Cat");
		uniqueSet.add("Apple");
		uniqueSet.add("Ball");
		
		//Print an elements of the Set
		System.out.println("UniqueSet: " + uniqueSet);
		
		//Retrieve element from set using Iterator
		Iterator<String> iterator = uniqueSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator: " + iterator.next());
		}
	}
}
