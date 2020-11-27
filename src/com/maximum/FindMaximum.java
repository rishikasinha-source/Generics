package com.maximum;

import java.util.Scanner;

public class FindMaximum {
		/*public static Integer max(Integer first, Integer second, Integer third) {
		Integer max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}
	public static Float max(Float first, Float second, Float third) {
		Float max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}

	public static String max(String first, String second, String third) {
		String max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}*/
	public static <E extends Comparable<E>> E max(E first, E second, E third) {
		E max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}
	public class FindMax<T extends Comparable<T>> {
		private T first,second,third;
		
		public FindMax(T first,T second,T third) {
			this.first=first;
			this.second=second;
			this.third=third;
		}
		public FindMax() {
			// TODO Auto-generated constructor stub
		}
	}

	public static void main(String[] args) {
			Integer[] intArray = { 1, 2, 3 };
			Float[] floatArray = { 2.12f, 3.121f, 4.12f };
			String[] stringArray = { "Apples", "Peach", "Pineapple" };

			System.out.println("max integer :" + max(intArray[0], intArray[1], intArray[2]));
			System.out.println("max float :" + max(floatArray[0], floatArray[1], floatArray[2]));
			System.out.println("max String :" + max(stringArray[0], stringArray[1], stringArray[2]));
		}

	}

