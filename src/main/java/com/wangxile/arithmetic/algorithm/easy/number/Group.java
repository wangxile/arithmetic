package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *	有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输出。
 */
public class Group {
   public static void main(String[] args) {
	   int count = 0;
	   for(int i = 1; i <= 4; i++){
		   for(int j = 1; j <= 4; j++){
			   for(int k = 1; k <= 4; k++){
				   if(i!=j && j!=k && i!=k){
					   count++;
					   System.out.println(i*100 + j*10 + k);
				   }
			   }
		   }
	   }
	   System.out.println(count);
   }
}
