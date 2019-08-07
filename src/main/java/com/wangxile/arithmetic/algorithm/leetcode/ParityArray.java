package com.wangxile.arithmetic.algorithm.leetcode;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ParityArray {
	//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
	//所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
	
	//每次找到  最左端的偶数下标为i  最右端的奇数下标为j
	//然后 从对i-j之间的数进行位置调换   调换规则为: i和i+1进行比较  当i为偶数 i+1为奇数时候 进行位置交换
	//如此循环  排序结束。
	public static void main(String[] args) throws FileNotFoundException {
		int[] array = {33, 4, 45, 65, 234, 2, 5, 7, 34, 76};
		int i = 0;
		int j = array.length - 1;
		while (j - i > 1) {
			i = findFirstEvenIndex(array);
			j = findLastOddIndex(array);
			swapFromIToJ(array, i ,j);
		}
		System.out.println(Arrays.toString(array));
	}
	
	private static int findFirstEvenIndex(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) 
				return i;
		}
		return -1;
	}
	
	private static int findLastOddIndex(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] % 2 == 1) {
				return i;
			}
		}
		return -1;
	}
	
	private static void swapFromIToJ(int[] array, int i, int j) {
		for (int index = i; index < j; index++) {
			int pre = array[index];
			int suf = array[index + 1];
			if (pre % 2 == 1) {
				continue;
			}
			if (suf % 2 == 0) {
				continue;
			}
			array[index] = suf;
			array[index + 1] = pre;
		}
	}
	
}
