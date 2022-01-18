package hashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>(); 
		
		hMap.put(1, "A");
		hMap.put(2, "B");
		hMap.put(3, "C");
		hMap.put(4, "D");
		hMap.put(5, "E");
		
		System.out.println(hMap.get(1));
		System.out.println(hMap.get(2));
		System.out.println(hMap.get(3));
		System.out.println(hMap.get(4));
		System.out.println(hMap.get(5));
		
		for(Entry m:hMap.entrySet()) {
			System.out.println(m.getKey()+" == "+m.getValue());
		}

	}

}
