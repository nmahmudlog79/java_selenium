package map_concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "A");
		map.put(200, "B");
		map.put(300, "C");
		map.put(400, "D");
		
		//element traverse in any order
		for(Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
