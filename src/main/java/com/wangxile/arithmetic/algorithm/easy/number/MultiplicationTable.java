package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *	乘法口诀
 */
public class MultiplicationTable {
	public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
