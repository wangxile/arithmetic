package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class MegeSort {
	public static void megeArray(int arr[], int l, int mid, int r){
		int[] copyArr = new int[r-l+1];
		for(int i=l;i<=r;i++){
			copyArr[i-l] = arr[i];
		}
		int j = mid+1;
		int i = l;
		for(int k = l;k <= r; k++){
			if(i > mid){
				arr[k] = copyArr[j-l];
				j++;
			} else if(j > r){
				arr[k] = copyArr[i-l];
				i++;
			}else if(copyArr[j-l] > copyArr[i-l]){
				arr[k] = copyArr[i-l];
				i++;
			}else{
				arr[k] = copyArr[j-l];
				j++;
			}
		}
	}
   public static void megeSort(int arr[],int l,int r){
	   if(l >= r){
		   return;
	   }
	   int mid  = (l+r)/2;
	   megeSort(arr,l,mid);
	   megeSort(arr,mid+1,r);
	   megeArray(arr,l,mid,r);
   }
   public static void main(String[] args) {
	   //int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
	   int[] arr = SelectSort.createRandomArray(10,10,40);
	   System.out.println(Arrays.toString(arr));
	   megeSort(arr, 0, arr.length-1);
	   System.out.println(Arrays.toString(arr));
   }
}
