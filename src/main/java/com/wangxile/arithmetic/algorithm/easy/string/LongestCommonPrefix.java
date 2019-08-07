package com.wangxile.arithmetic.algorithm.easy.string;

import java.util.Arrays;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/2/22
 * @Modified by:
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 * 思路很简单！先利用Arrays.sort(strs)为数组排序，再将数组第一个元素和最后一个元素的字符从前往后对比即可！
 */
public class LongestCommonPrefix {
    public static String replaceSpace(String[] strs) {
        // 数组长度
        int len = strs.length;
        // 用于保存结果
        StringBuffer res = new StringBuffer();
        // 注意：=是赋值，==是判断
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len - 1].length();
        int num = Math.min(m, n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                res.append(strs[0].charAt(i));
            } else
                break;

        }
        return res.toString();

    }
    //测试
    public static void main(String[] args) {
        String[] strs = { "customer", "car", "cat" };
        System.out.println(LongestCommonPrefix.replaceSpace(strs));//c
    }
}
