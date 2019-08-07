package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *给你一个数组，除了一个数字外，其他的数字都出现了两次，请把这个只出现一次的数字找出来。
 *
 *	这个问题最佳的解法是用到了位运算的异或操作：
 *	如果5^5=0
 *	如果5^7^5 = 7
 *	如果5^6^6^5^7^8^7 = 8
 */
public class SingleNumber {
	 public static int singleNumber(int[] nums, int numsSize) {
        // 第一个数和数组后面的数做^运算，留下的必然是单个数字
        int k = nums[0];
        for (int i = 1; i < numsSize; i++) {
            k = (k ^ nums[i]);
        }
        return k;
    }
}
