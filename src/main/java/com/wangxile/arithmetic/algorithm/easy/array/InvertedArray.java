package com.wangxile.arithmetic.algorithm.easy.array;

import java.util.Arrays;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/1/6
 * @Modified by:
 *
 * 有数组 a[n] ，用代码将数组元素顺序颠倒.
 */
public class InvertedArray {
    public static void main(String[] args) {
        int [] a = new int[]{
                (int)(Math.random() * 1000),
                (int)(Math.random() * 1000),
                (int)(Math.random() * 1000),
                (int)(Math.random() * 1000),
                (int)(Math.random() * 1000)};
        System.out.println(Arrays.toString(a));
        swap(a);
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int a[]){
        int len = a.length;
        for(int i=0;i<len/2;i++){
            int tmp = a[i];
            a[i] = a[len-1-i];
            a[len-1-i] = tmp;
        }
    }
}
