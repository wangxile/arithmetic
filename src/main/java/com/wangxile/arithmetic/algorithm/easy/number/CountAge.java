package com.wangxile.arithmetic.algorithm.easy.number;

public class CountAge {
	
	public static int sum(int n){
		if(n==1){
			return 1;
		}else{
			return n + sum(n-1);
		}
	}
	
	//尾递归
	public static int sum(int n, int result){
		if(n==1){
			return result;
		}else{
			return sum(n - 1, n + result);
		}
	}
	
	public static int count(int n){
		if(n==1){
			return 10;
		}else{
			return 2 + count(n-1);
		}
	}
	
	public static void del(int n){
		System.out.println(n);
		if(n<5000){
			del(n*2);
		}
		System.out.println(n);
	}
	public static void main(String[] args) {
		System.out.println(sum(9));
		System.out.println(sum(9,1));
		System.out.println(count(3));
		del(1024);
	}
}
