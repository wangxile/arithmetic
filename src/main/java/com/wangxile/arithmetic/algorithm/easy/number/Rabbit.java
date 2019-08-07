package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *	古典问题:有一对兔子，从出生后第3个月起每个月都生一对兔子，
 *	小兔子长到第四 个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少?
 */
public class Rabbit {
	 public static int f(int n){
		 if(n == 1 || n == 2){
			 return 1;
		 }else{
			 return f(n-1) + f(n-2);
		 }
	 }
	 
	 public static void main(String[] args) {
		System.out.println(f(10));
	}
}
