package com.epam.rd.autotasks.task02;

public class Task02 {

	public static int maximumDistance(int[] array) {
		if (array == null || array.length == 0 || array.length ==1) return 0;
		int maxIndex = 0;
		int maxN = array [maxIndex];
		for (int i=1; i < array.length; i++) {
			if (array[i] > maxN) {
				maxN = array[i];
				maxIndex = i;
			}
		}
		int maxLastIndex = 0;
		for (int j=1; j < array.length; j++) {
			if (array[j] == maxN) {
				maxLastIndex = j;
			}
		}

		return maxLastIndex - maxIndex;
	}

	public static void main(String[] args) {
		{
			int[] array = null;
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] {};
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 4, 100, 3, 4 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 5, 50, 50, 4, 5 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 5, 350, 350, 4, 350 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 10, 10, 10, 10, 10 };
			System.out.println("result = " + maximumDistance(array));
		}
	}

}
