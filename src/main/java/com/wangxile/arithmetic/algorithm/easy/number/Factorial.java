package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 * 求1+2!+3!+…+20!的和
 */
public class Factorial {
	public static int fac(int i, int sum) {
		if(i==1){
			return sum;
		} else {
			return fac(i-1, sum * i);
		}
	}
		
	public static void main(String[] args) {
		long sum = 0;
		long ver = 1;
		for(int i = 1; i <= 20; i++){
			ver = ver*i;
			sum += ver;
		}
		System.out.println(sum);
		System.out.println(fac(5, 1));
	}
}
