package week13;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colours = {"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<>();
		
		for(String c : colours) {
			list1.add(c);
		}
		
		String[] colours2 = {"gold", "white", "brown", "blue", "gray", "silver"};
		List<String> list2 = new LinkedList<>();
		
		for(String c : colours2) {
			list2.add(c);
		}
		
		list1.addAll(list2);
		list2 = null; // Releases resources;
		printList(list1);
		
		convertToUppercaseString(list1);
		printList(list1);
	}
	
	private static void printList(List<String> list) {
		System.out.printf("%nList:%n");
		
		for(String c : list) {
			System.out.printf("%s ", c);
		}
		
		System.out.println();
	}
	
	private static void convertToUppercaseString(List<String> list) {
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			String colour = itr.next();
			itr.set(colour.toUpperCase());
		}
	}
}










