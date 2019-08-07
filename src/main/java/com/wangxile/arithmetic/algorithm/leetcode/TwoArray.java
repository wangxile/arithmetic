package com.wangxile.arithmetic.algorithm.leetcode;

public class TwoArray {
	//二维数组动态规划
	public static int searchMin(int[][] arr, int x, int y){
		if(x == 0 && y==0){
			return arr[x][y];
		}else if(x == 0){
			return arr[x][y] + searchMin(arr, x, y-1);
		}else if(y == 0){
			return arr[x][y] + searchMin(arr, x-1, y);
		}else{
			return arr[x][y] + Math.min(searchMin(arr, x-1, y), searchMin(arr, x, y-1));
		}
	}
	
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{1,2,3}};
		System.out.println(searchMin(a, a.length-1, a[0].length-1));
	} 
	
}
