package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class DuiSort {
	 public static void duiSort(int[] arr, int l, int r){
		 int mid = (r-l)/2+l+1;
		 for(int i=mid; i>=0; i--){
			 showDown(arr,arr.length,i);
		 }
		 for(int i=arr.length-1;i>=0;i--){
			 int temp = arr[0];
			 arr[0] = arr[i];
			 arr[i] = temp;
			 showDown(arr,i,0);
		 }
	 }
	 public static void showDown(int[] arr, int count, int i){
		 while(2*i+1<count){
			 int j = 2*i+1;
			 if(j+1<count && arr[j]<arr[j+1]){
				 j += 1;
			 }
			 if(arr[i] >= arr[j]){
				 break;
			 }
			 int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 i = j;
		 }
	 }
	public static void main(String[] args) {
		  // int[] arr = SelectSort.createRandomArray(10,10,40);
		   int[] arr = new int[]{10,2,3,2,1,45,15,14,21,121};
		   System.out.println(Arrays.toString(arr));
		   duiSort(arr, 0, 9);
		   System.out.println(Arrays.toString(arr));
		   
	   }
}
