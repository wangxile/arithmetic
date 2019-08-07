package com.wangxile.arithmetic.algorithm.easy.string;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/1/2
 * @Modified by:
 *
 *  给定两个字符串s和t，判断这两个字符串中的字母是不是完全一样（顺序可以不一样）
 *
 * 思路：
 *  遍历这两个字符串，用每个字符减去'a'，将其分别存入到数组中去，随后看这两个数组是否相等即可
 *  'c'-'a'=2即可计算出存储的位置，如果有多个，则+1即可，后面我们来比较数组大小
 *
 *  A的ASCII码是65，a的ASCII码是97。
 *  其对应的小写字母的ASCII码数值就算出来了，是大写字母的ASCII码数值+32。
 */
public class IsAnagram {
    public static void isAnagram() {
        //分别存储字符串的字符
        char[] array1 = new char[26];
        char[] array2 = new char[26];

        String s1 = "pleasefollowthewechatpublicnumber";
        String s2 = "pleowcnumberthewechatpubliasefoll";

        for (int i = 0; i < s1.length(); i++) {
            char value = s1.charAt(i);
            int index = value - 'a';
            array1[index]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char value = s2.charAt(i);
            int index = value - 'a';
            array2[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("不相同");
                return;
            }
        }

        System.out.println("相同");


    }

    public static void main(String[] args) {
        char a = 'A'+32;
        System.out.println(a);
    }
}
