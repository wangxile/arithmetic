package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class SelectSort {
	 //循环每次找到最小的放在指定的位置
   public static void selectSort(int[] arr, int n){
	   for(int i=0; i<n; i++){
		   int minIndex = i;
		   for(int j=i+1; i<n;j++){
			   if(arr[j] < arr[minIndex]){
				   minIndex = j;
			   }
		   }
		   int temp = arr[i];
		   arr[i] = arr[minIndex];
		   arr[minIndex] = temp;
	   }
   } 
   public static int[] createRandomArray(int size, int start, int end){
	int[] array = new int[size];
	for(int i = 0; i < size; i++){
		array[i] = (int)(Math.random()*(end - start + 1)) + start;
	}
	return array;
   }
   
   public static void main(String[] args) {
	   int[] arr = createRandomArray(10,10,40);
	   System.out.println(Arrays.toString(arr));
	   selectSort(arr, 10);
	   System.out.println(Arrays.toString(arr));
	   
   }
}
