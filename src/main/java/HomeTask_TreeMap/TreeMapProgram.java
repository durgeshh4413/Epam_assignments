package HomeTask_TreeMap;

import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tree_map= new TreeMap<Integer, Integer>();
		
		//first test case
		tree_map.put(1, 2);
		tree_map.put(66, 3);
		System.out.println(tree_map.get(66));
		tree_map.remove(1);
		System.out.println("Size of tree map : "+tree_map.size());
		System.out.println(tree_map.firstKey());
		
		
		TreeMap<Integer, Integer> tree_map2= new TreeMap<Integer, Integer>();
		//Second test case
		tree_map2.put(1, 66);
				System.out.println(tree_map2.get(5));
				System.out.println("Size of tree map : "+tree_map2.size());
				System.out.println(tree_map2.firstKey());
	}

}
