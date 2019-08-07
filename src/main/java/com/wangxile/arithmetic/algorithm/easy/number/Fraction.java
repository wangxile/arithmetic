package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *	2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class Fraction {
	public static void sumi(){
		double up = 2;
		double down = 1;
		double fraction = up/down;
		double temp = 0;
		double sum = 0;
		for(int i = 0; i < 20; i++){
			sum += fraction;
			temp = up;
			up = up + down;
			down = temp;
			fraction = up/down;
		}
		System.out.println("前20项之和是："+sum);
	}
	
	public static void main(String[] args) {
		sumi();
	}
}
