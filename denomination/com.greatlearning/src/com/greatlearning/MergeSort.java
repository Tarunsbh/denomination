package com.greatlearning;

public class MergeSort {
	// divide
	public static void divide(int arr[], int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int mid = startIndex + (endIndex - startIndex) / 2;
		divide(arr, startIndex, mid);
		divide(arr, mid + 1, endIndex);
		conquer(arr, startIndex, mid, endIndex);
	}

	// conquer
	public static void conquer(int arr[], int startIndex, int mid, int endIndex) {
		int merge[] = new int[endIndex - startIndex + 1];
		int ind1 = startIndex;
		int ind2 = mid + 1;
		int x = 0;

		while (ind1 <= mid && ind2 <= endIndex) {
			if (arr[ind2] <= arr[ind1]) {
				merge[x++] = arr[ind1++];
			} else {
				merge[x++] = arr[ind2++];
			}
		}
		while (ind1 <= mid) {
			merge[x++] = arr[ind1++];
		}
		while (ind2 <= endIndex) {
			merge[x++] = arr[ind2++];
		}
		for (int i = 0, j = startIndex; i < merge.length; i++, j++) {
			arr[j] = merge[i];
		}
	}
}