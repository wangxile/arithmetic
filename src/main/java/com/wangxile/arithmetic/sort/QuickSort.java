package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class QuickSort {
	 public static int quickArray(int arr[], int l, int r){
		 int j = l;
		 for(int i = l+1; i <= r ; i++){
			 if(arr[i] < arr[l]){
				 int temp = arr[j+1];
				 arr[j+1] = arr[i];
				 arr[i] = temp;
				 j++;
			 }
		 }
		 int temp = arr[j];
		 arr[j] = arr[l];
		 arr[l] = temp;
		return j;
	 }
	 
	 public static int partition2(int[] arr,int left,int right){  
			 int v = arr[left];
			 int i = left + 1;       
			     int j = right;         
			      while (true) {
			         while ((i <= right) && (arr[i] >= v)) i++;    
			         while ((j >= left + 1) && (arr[j] <= v)) j--; 
			         if (i >= j) break;                          
			         int temp = arr[j];
			         arr[j] = arr[i];
			         arr[i] = temp;
			         i++;                                        
			         j--;
			     }
			      int t = arr[j];
			      arr[j] = arr[left];
			      arr[left] = t;
			      return j;
			      
	    }  
	 public static void quickSort(int arr[], int l, int r){
		 if(l >= r){
			 return;
		 }
		 int p = partition2(arr, l, r);
		 quickSort(arr, l, p-1);
		 quickSort(arr, p+1, r);
	 }
	 public static int[] createRandomArray(int size, int start, int end){
			int[] array = new int[size];
			for(int i = 0; i < size; i++){
				array[i] = (int)(Math.random()*(end - start)) + start;
			}
			return array;
     }
	 public static void main(String[] args) {
		   int[] arr = createRandomArray(20,10,40);
		    //int[] arr = new int[]{10,9,7,7,6,5,4,3,2,1};
		   System.out.println(Arrays.toString(arr));
		   quickSort(arr, 0,arr.length-1);
		   System.out.println(Arrays.toString(arr));
		   
	   }
}
