package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 *将一个数组的元素，其中是0的，放在数组的最后
 */
public class MoveZero {
	 public static void moveZero(int[] arrays) {
		 // 在j前面的元素都不是0
        int j = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != 0) {
                // 跟j进行交换，保证j的前面都不是0
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j]  = temp;
                j++;
            }
        }
        // 直至i遍历完毕后，j前面都不是0，j-i都是0(这就完成我们的任务了)
        System.out.println("关注公众号：Java3y---->" + arrays);
	 }
}
