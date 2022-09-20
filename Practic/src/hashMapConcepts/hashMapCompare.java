package hashMapConcepts;

import java.util.*;

public class hashMapCompare {
	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		// 1.on the basis of key-value: use equals method:

		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));

		// 2. compare hashMaps for the same keys: keySet();

		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));

		// 3. find out the extra keys:

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();

		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");

		// combine the key from both the maps: using HashSet:
		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());

		// add the keyset from map4:
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);

	}
}
