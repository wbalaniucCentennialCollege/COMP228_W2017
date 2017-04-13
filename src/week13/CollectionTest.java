package week13;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colours = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> list = new ArrayList<String>();
		
		for(String c : colours)
		{
			// Populate list with values
			list.add(c);
		}
		
		String[] removeColours = {"RED", "WHITE", "BLUE"};
		List<String> removeList = new ArrayList<String>();
		
		for(String c : removeColours) {
			// Populate remove list with values
			removeList.add(c);
		}
		
		System.out.println("ArrayList: ");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
		
		removeColours(list, removeList);
		
		System.out.printf("%n%nArrayList after calling removeColours:%n");
		
		for(String c : list) {
			System.out.printf("%s ", c);
		}
	}
	
	private static void removeColours(Collection<String> coll1, Collection<String> coll2) {
		Iterator<String> itr = coll1.iterator();
		
		// Iterate through the collection object.
		// Searches for common elements and removes them. 
		while(itr.hasNext()) {
			if(coll2.contains(itr.next())) {
				itr.remove();
			}
		}
	}

}















