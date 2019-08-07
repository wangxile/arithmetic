package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/1/2
 * @Modified by:
 *
 * 判断是否是2的某次方
 *
 *这题还有另一种解决方式，就是位运算：
 *      2的n次方都有一个特点，二进制都是1000000
 *      如果 2的n次方的二进制-1和2的n次方二进制做按位与运算，那么得出的结果肯定是0
 */
public class IsPowerOfTwo {
    public static void isPowerOfTwo() {
        int num = 15;
        if (num == 0) {
            System.out.println("不是");
        }
        while (num % 2 == 0){
            num = num / 2;
        }
        if (num == 1) {
            System.out.println("是");
        } else {
            System.out.println("不是");

        }
    }

    public static void isPowerOfTwo2() {
        int num = 15;
        if(num <= 0){
            System.out.println("不是");
        }
        else if(num == 1){
            System.out.println("是");
        }
        else{
            if( (num & (num-1) ) == 0){
                System.out.println("是");
            }
            else{
                System.out.println("不是");
            }
        }
    }
}
