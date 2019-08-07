package com.wangxile.arithmetic.algorithm.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/1/6
 * @Modified by:
 *
 * 有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数。
 *
 */
public class CountStr {
    public static void main(String[] args){
        String content = "中国 aadf 的 111 萨 bbb 菲的 zz 萨菲";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<content.length();i++) {
            char c = content.charAt(i);
            Integer num = map.get(c);
            if(num == null)
                num = 1;
            else{
                num = num + 1;
                map.put(c,num);
            }
        }
        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        }


}
