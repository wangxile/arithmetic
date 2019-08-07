package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *	给你一个数组{0,1,2,3,….n}，其中有一个数字缺失，请把缺失的数字找出来
 */
public class MissingNumber {
	
	public void missingNumber(int[] arrays) {
		// 套用等差求和公式
	    int sum = (arrays[0] + arrays[arrays.length - 1]) * (arrays.length + 1) / 2;
	    // 遍历数组，得出的sum减去数组每一位元素，最后即是缺失的数字
	    for (int value : arrays) {
	        sum = sum - value;
	    }
	    System.out.println("缺失的数字是：" + sum);
	}
	
}
