package LEC1030;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LEC1030 {
	public int aoso; 

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		// 1 2 3 4 5 6

		// Collection useful local methods
		Collections.shuffle(al);
		// System.out.println(al.toString());

		Collections.sort(al);
		//// System.out.println(al.toString());

		Collections.reverse(al);
		//// System.out.println(al.toString());

		Collections.swap(al, 1, 4);
		// System.out.println(al.toString());

		// Map<Key, Value>

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(3, "C");
		map.put(2, "B");
		map.put(5, "E");
		/*
		 * char a = (char) 97; char z = (char) 123; //z
		 */

		System.out.println(map.toString());
		// build a map with key 1 ~ 26 , and value a ~ z
		// with using

		HashMap<Integer, Character> charMap = new HashMap<>();
		for (int i = 1; i <= 26; i++) {
			charMap.put(i, (char) (96 + i));
		}
		// a ~ z = 97 ~ 123
		String hello = "" + charMap.get(8) + charMap.get(5) + charMap.get(12) + charMap.get(12) + charMap.get(15) + "";

		//System.out.println(hello);
		// System.out.println(charMap.toString());

		// Whats in the box?
		// There's a 9 * 9 boxes and has random character in it.
		// Using scanner, when you point any specific box, it returns the
		// character it contains.
		// Make sure to shuffle at least once
		ArrayList<ArrayList<Integer>> al2 = new ArrayList<>();
		for(int i = 0; i < 9; i++){
			ArrayList<Integer> all = new ArrayList<>();
			al2.add(i, all);
		}
	}
}
