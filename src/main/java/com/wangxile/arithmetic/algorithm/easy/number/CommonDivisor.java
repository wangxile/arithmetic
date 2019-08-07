package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *	题目：输入两个正整数m和n，求其最大公约数和最小公倍数。   
 ** 在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，
 *  如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。 
 */
public class CommonDivisor {
  public static int commonDivisor(int a, int b){
	  int c = a % b;
	  if(c == 0){
		  return b;
	  }else{
		  return commonDivisor(b, c);
	  }
  }
  
  public static void main(String[] args) {
	  int a = 90;
	  int b = 10;
	  int i = commonDivisor(a,b);
	  System.out.println("最大公因数" + i);
      System.out.println("最小公倍数" + a*b/i);
  }
}
