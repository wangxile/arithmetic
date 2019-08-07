package com.wangxile.arithmetic.algorithm.easy.string;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/1/6
 * @Modified by:
 *
 * 如果一串字符如"aaaabbc中国1512"要分别统计英文字符的数量，中文字符的数量，和数字字符的数量，假设字符中没有中文字
 * 符、英文字符、数字字符之外的其他特殊字符。
 *
 */
public class AllCount {
    public static void main(String[] args) {
        String str = "aaaabbc中国1512";
        int engishCount = 0;
        int chineseCount = 0;
        int digitCount = 0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9') {
                digitCount++;
            }else if((ch>='a' && ch<='z')) {
                engishCount++;
            }else{
                chineseCount++;
            }
        }
        System.out.println(digitCount);
        System.out.println(chineseCount);
        System.out.println(engishCount);
    }
}
