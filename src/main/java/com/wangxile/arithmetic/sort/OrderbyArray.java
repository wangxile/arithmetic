package com.wangxile.arithmetic.sort;

import java.util.Arrays;

public class OrderbyArray {
	//冒泡排序 Bubble Sort 最简单的排序方法是冒泡排序方法
    public int[] orderArray(int[] array){
    	for(int i=0;i<array.length;i++){
    		for(int j=i+1;j<array.length;j++){
    			if(array[i]>array[j]){
    				int s = array[i];
    				array[i] = array[j];
    				array[j] = s;
    			}
    		}
    	}
    	return array;
    }
	public static void main(String[] args) {
		int [] array = {1,8,5,2,4,4,9,7,10,20};
		OrderbyArray order = new OrderbyArray();
		array = order.orderArray(array);  
		 System.out.println(Arrays.toString(array));
	}
}

