package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class QuickSort3Way {
	 public static void quickSort3(int[] arr, int l, int r){
//		  if (r - l <= 15) {
//	            // 当分块中元素为15+1时，换成插入排序
//	            InsertSort.insertSort(arr, l, r);
//	            return;
//	        }
		 //随机取数优化
		 if(l >= r){
			 return;
		 }
		 int random = (int) (Math.random() * (r - l + 1)) + l;
		 int temp = arr[random];
		 arr[random] = arr[l];
		 arr[l] = temp;
		   
		   int v = arr[l];
		   int i = l + 1;
		   int lt = l;
		   int gt = r;
		   while(i <= gt){
		      if(arr[i] < v){
	    	    int t = arr[i];
	    	    arr[i] = arr[lt+1];
	    	    arr[lt+1] = t;
		        lt++;
		        i++;
		      }else if(arr[i]>v){
		       int t = arr[i];
		       arr[i] = arr[gt];
		       arr[gt] = t;
		       gt--;
		      }else{
		        i++;
		      }
		   }
		   arr[l] = arr[lt];
		   arr[lt] = temp;
		 quickSort3(arr, l, lt-1);
		 quickSort3(arr, gt, r);
	 }
	 public static int[] createRandomArray(int size, int start, int end){
			int[] array = new int[size];
			for(int i = 0; i < size; i++){
				array[i] = (int)(Math.random()*(end - start + 1)) + start;
			}
			return array;
      }
	 public static void main(String[] args) {
		   //int[] arr = createRandomArray(5,10,100);
		   int[] arr = {35,6,9,1,2};
		   System.out.println(Arrays.toString(arr));
		   quickSort3(arr, 0,arr.length-1);
		   System.out.println(Arrays.toString(arr));
		   
	   }
}
