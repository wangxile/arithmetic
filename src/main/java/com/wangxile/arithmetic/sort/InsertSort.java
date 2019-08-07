package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class InsertSort {
	//不管第一个元素  直接从第二个开始 和之前的元素比较大小  最后找到合适的位置放置
    public static void insertSort(int arr[], int l, int r){
    	for(int i=l+1; i<=r; i++){
    		int min = arr[i];
    		int j=i;
    		for(;j>0 && arr[j-1] > min; j--){
    			arr[j] = arr[j-1];
    		}
    		arr[j] = min;
    	}
    }
	public static void main(String[] args) {
		   int[] arr = SelectSort.createRandomArray(10,10,40);
		   System.out.println(Arrays.toString(arr));
		   insertSort(arr, 0, 9);
		   System.out.println(Arrays.toString(arr));
	   }
}
