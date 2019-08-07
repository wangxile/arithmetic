package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *	求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class AAA {
	public static void main(String[] args) {
		 int a = 2;
         int n = 5;
         
         int sum = 0;
         int b = 0;
         for(int i = 1; i <= n; i++){
        	 b += a;
        	 sum += b;
        	 a= a*10;
         }
         System.out.println(sum);
	}
}
