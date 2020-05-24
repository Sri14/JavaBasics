package oopsConceptPart2;

import java.util.Hashtable;

public class HashTableConcept {

	//they don't work on index they work on key and value pair
	// put is the key word add
	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("Name", "Sam");
		h.put("Age", 20);
		h.put("NiNumber", "SK1231211");
		
		System.out.println(h.size());
		System.out.println(h.get("Age"));
		
		//restricting the hashtable to take only integers as key value pairs
		Hashtable<Integer, Integer> h1 = new Hashtable <Integer, Integer>();
		
		h1.put(1, 100);
		h1.put(2, 200);		
	}

}
