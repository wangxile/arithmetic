package com.wangxile.arithmetic.algorithm.easy;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/23
 * @Modified by:
 */
public class factorial {
    public static void main(String[] args) {
        int n = 50;
        int[] ints = new int[100];
        ints[ints.length - 1] = 1;

        for (int i = 1; i <= n; i++) {
            ints = demo(ints, i);
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }

    static int[] demo(int[] ints, int sum) {
        //计算每一位
        for (int i = 0; i < ints.length; i++) {
            ints[i] *= sum;
        }
        //进位和留位
         for (int i = ints.length - 1; i > 0; i--) {
            ints[i - 1] += ints[i] / 10;
            ints[i] = ints[i] % 10;
        }
        return ints;

    }

}
