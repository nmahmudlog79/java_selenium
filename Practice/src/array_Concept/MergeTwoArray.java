package array_Concept;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
	public static void main(String[] args) {
		int [] arrayA = {1,3,4};
		int [] arrayB = {4,5,7,8};
		int [] mergeArray = mergeTwoArray(arrayA, arrayB);
		System.out.println(Arrays.toString(mergeArray));
	}
	private static int[] mergeTwoArray(int[] arrayA, int[] arrayB) {
		IntStream num = IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB));
		int[] remove = num.distinct().sorted().toArray();
		return remove;
	}

}
