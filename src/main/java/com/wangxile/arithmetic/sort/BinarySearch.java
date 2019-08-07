package com.wangxile.arithmetic.sort;


 public class BinarySearch {
     /*
     * 循环实现二分查找算法arr 已排好序的数组x 需要查找的数-1 无法查到数据
      */
     public static int binarySearch(int[] arr, int x) {
         /**
          *@Description:
          *@param:[arr, x]
          *@return:int
          *@Author:wangqi
          *@Date:Created in 16:33 2018/7/5
          *@Modified by:
          */
         int low = 0;
         int high = arr.length-1;
         while(low <= high) {
        	 //low+high 如果数字过大 可能int型会出现精度丢失
            // int middle = (low + high)/2;
        	 int middle = low + (high - low)/2;
             if(x == arr[middle]) {
                 return middle;
             }else if(x <arr[middle]) {
                 high = middle - 1;
             }else {
                 low = middle + 1;
             }
         }
         return -1;
     }
     //递归实现二分查找
     public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
         //int midIndex = (beginIndex+endIndex)/2;
         int midIndex = beginIndex + (endIndex - beginIndex)/2;
         if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
             return -1;
         }
         if(data <dataset[midIndex]){
             return binarySearch(dataset,data,beginIndex,midIndex-1);
         }else if(data>dataset[midIndex]){
             return binarySearch(dataset,data,midIndex+1,endIndex);
         }else {
             return midIndex;
         }
     }

     public static void main(String[] args) {
         int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
         System.out.println("循环查找：" + (binarySearch(arr, 87) + 1));
         System.out.println("递归查找"+binarySearch(arr,87,0,arr.length-1));
     }
 }