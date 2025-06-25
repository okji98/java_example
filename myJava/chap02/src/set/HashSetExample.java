package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("Python");
		set.add("HTML");
		set.add("CSS");
		set.add("Java");

		int size = set.size();
		System.out.println("총 객체수: " + size);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println("\t" + element);
		}

		set.remove("Python");
		set.remove("CSS");

		System.out.println("총 객체수: " + set.size());

		it = set.iterator();
		for (String element : set) {
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
