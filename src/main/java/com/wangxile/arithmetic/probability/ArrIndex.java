package com.wangxile.arithmetic.probability;

/**
 * 巧用数组下标
 * @author Administrator
 */
public class ArrIndex {
	
	/**
	 * 给你n个无序的int整型数组arr，并且这些整数的取值范围都在0-20之间，
	 * 要你在 O(n) 的时间复杂度中把这 n 个数按照从小到大的顺序打印出来。
	 * @param arr
	 */
	public static void f(int arr[]){
		int[] temp = new int[21];
		for(int i = 0; i < arr.length; i++){
			temp[arr[i]]++;
		}
		
		for(int i = 0; i < temp.length; i++){
			for(int j = 0; j < temp[i]; j++){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[]{3,4,3,2,9,20,18,14,12,12,15,15,19,11,4,2,5,6,7,3,0,12,3};
		f(arr);
	}

}
