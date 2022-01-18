package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer [] {1,2,3,4,5,6,7,8}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer [] {1,2,3,9,10}));
		
		//get the union:
		Set<Integer> union  = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		//get the intersection
		System.out.println("\n------------------");
		Set<Integer> intersection  = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		//get the differences
		System.out.println("\n------------------");
		Set<Integer> diff  = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
	}

}
