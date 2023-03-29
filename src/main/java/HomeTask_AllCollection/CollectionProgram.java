package HomeTask_AllCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionProgram {
public static void main(String [] args) {
	
	System.out.println("ArrayList : ");
	System.out.println("---------------------------------------");
	 // Declaring the ArrayList
    ArrayList<Integer> al = new ArrayList<Integer>();

    // Appending new elements at
    // the end of the list
    for (int i = 1; i <= 5; i++)
        al.add(i);

    // Printing elements
    System.out.println(al);

    // Remove element at index 3
    al.remove(3);

    // Displaying the ArrayList
    // after deletion
    System.out.println(al);

    // Printing elements one by one
    for (int i = 0; i < al.size(); i++)
        System.out.print(al.get(i) + " ");
    
    System.out.println("---------------------------------------");
    System.out.println("Linked list : ");
    System.out.println("---------------------------------------");
    // Declaring the LinkedList
    LinkedList<Integer> ll = new LinkedList<Integer>();

    // Appending new elements at
    // the end of the list
    for (int i = 1; i <= 5; i++)
        ll.add(i);

    // Printing elements
    System.out.println(ll);

    // Remove element at index 3
    ll.remove(3);

    // Displaying the List
    // after deletion
    System.out.println(ll);

    // Printing elements one by one
    for (int i = 0; i < ll.size(); i++)
        System.out.print(ll.get(i) + " ");
    
    System.out.println("---------------------------------------");
    System.out.println("Hashset : ");
    System.out.println("---------------------------------------");
    HashSet<String> hs = new HashSet<String>();
    
    hs.add("Automation");
    hs.add("tesring");
    hs.add("Automation");
    hs.add("selenium");
    hs.add("Rest assured");

    // Traversing elements
    Iterator<String> itr = hs.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }
    
    System.out.println("---------------------------------------");
    System.out.println("LinkedHashSet  : ");
    System.out.println("---------------------------------------");
    
 // Creating LinkedHashSet and
    // adding elements
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();

    lhs.add("Automation");
    lhs.add("testing");
    lhs.add("Automation");
    lhs.add("Selenium");
    lhs.add("Java");

    // Traversing elements
    Iterator<String> itr2 = lhs.iterator();
    while (itr2.hasNext()) {
        System.out.println(itr2.next());
    }
    
    
    
    System.out.println("---------------------------------------");
    System.out.println("TreeSet  : ");
    System.out.println("---------------------------------------");
    
 // Creating TreeSet and
    // adding elements
    TreeSet<String> ts = new TreeSet<String>();

    ts.add("Automation");
    ts.add("Testing");
    ts.add("Automation");
    ts.add("Java");
    ts.add("Selenium");

    // Traversing elements
    Iterator<String> itr3 = ts.iterator();
    while (itr3.hasNext()) {
        System.out.println(itr3.next());
    }
    
    
    System.out.println("---------------------------------------");
    System.out.println("HashMap  : ");
    System.out.println("---------------------------------------");
    
 // Creating HashMap and
    // adding elements
    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    hm.put(1, "Automation");
    hm.put(2, "Testing");
    hm.put(3, "Java");

    // Finding the value for a key
    System.out.println("Value for 1 is " + hm.get(1));

    // Traversing through the HashMap
    for (Map.Entry<Integer, String> e : hm.entrySet())
        System.out.println(e.getKey() + " " + e.getValue());
    
    
    
    System.out.println("---------------------------------------");
    System.out.println("LinkedHashMap  : ");
    System.out.println("---------------------------------------");
 // Creating an empty LinkedHashMap
    LinkedHashMap<String, String> lhm
        = new LinkedHashMap<String, String>();

    // Adding entries in Map
    // using put() method
    lhm.put("one", "Automation");
    lhm.put("two", "Testing");
    lhm.put("four", "Java");

    // Printing all entries inside Map
    System.out.println(lhm);
    
    // Getting and printing value for a specific key
    System.out.println("Getting value for key 'one': "
                       + lhm.get("one"));

    // Getting size of Map using size() method
    System.out.println("Size of the map: "
                       + lhm.size());

    // Checking whether Map is empty or not
    System.out.println("Is map empty? "
                       + lhm.isEmpty());

    // Using containsKey() method to check for a key
    System.out.println("Contains key 'two'? "
                       + lhm.containsKey("two"));


    // Removing entry using remove() method
    System.out.println("delete element 'one': "
                       + lhm.remove("one"));

    // Printing mappings to the console
    System.out.println("Mappings of LinkedHashMap : "
                       + lhm);

    System.out.println("---------------------------------------");
    System.out.println("TreeMap  : ");
    System.out.println("---------------------------------------");
    
    Map<String, Integer> treeMap = new TreeMap<String, Integer>();
    
    // Adding elements to the tree map
    treeMap.put("A", 1);
    treeMap.put("C", 3);
    treeMap.put("B", 2);

    // Getting values from the tree map
    int valueA = treeMap.get("A");
    System.out.println("Value of A: " + valueA);

    // Removing elements from the tree map
    treeMap.remove("B");

    // Iterating over the elements of the tree map
    for (String key : treeMap.keySet()) {
        System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
    }
    
    
    
    
}


	

}

