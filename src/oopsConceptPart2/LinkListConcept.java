package oopsConceptPart2;

import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {
		
		//key word is add
		//print the link list - you just pass the reference
		// Set keyword to replace the value in any index
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.addFirst("John");	
		ll.add("Tom");
		ll.add("Sam");
		ll.addLast("Kate");
		
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		ll.set(2, "Boris");
		System.out.println(ll);
		ll.remove(ll.removeFirst());
		System.out.println(ll);

		// print all values
		
		for(int i =0; i<ll.size(); i ++) {
			System.out.println(ll.get(i));
		}
		

	}

}
