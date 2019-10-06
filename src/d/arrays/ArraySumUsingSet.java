package d.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet {

	public static void main(String args[]) {
		prettyPrint(getRandomArray(9), 11);
		prettyPrint(getRandomArray(10), 12);
	}

	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<Integer>(numbers.length);
		for (int value : numbers) {
			int target = n - value; // if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}

	/**
	 * Utility method to find two elements in an array that sum to k
	 * 
	 * @param random
	 * @param k
	 */

	public static void prettyPrint(int[] random, int k) {
		System.out.println("Random Integer array : " + Arrays.toString(random));
		System.out.println("Sum : " + k);
		System.out.println("pair of numbers from an array whose sum equals " + k);
		printPairsUsingSet(random, k);

	}

	/**
	 * Utility method to return random array of Integers in a range of 0 to 15
	 * 
	 * @param length
	 * @return
	 */
	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;

	}

}
