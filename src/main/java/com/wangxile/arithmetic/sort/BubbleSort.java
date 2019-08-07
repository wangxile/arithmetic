package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array =  {38,4,5,3};
		bubbleSort(array, array.length);
		System.out.println(Arrays.toString(array));
	}
	
	// 冒泡排序，a 表示数组，n 表示数组大小
	public static void bubbleSort(int[] a, int n) {
		if (n <= 1) return;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j+1]) { // 交换
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	 }
}
