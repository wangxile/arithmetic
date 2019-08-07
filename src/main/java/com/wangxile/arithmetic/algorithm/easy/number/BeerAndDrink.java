package com.wangxile.arithmetic.algorithm.easy.number;

/**
 * @author Administrator
 * 啤酒每罐2.3元，饮料每罐1.9元。小明买了若干啤酒和饮料，一共花了82.3元。
 * 我们还知道他买的啤酒比饮料的数量少，请你计算他买了几罐啤酒。
 */
public class BeerAndDrink {
	  /**
     * 啤酒与饮料题目
     */
    public static void beerAndDrink() {
        // 啤酒
        for (int i = 0; i < 36; i++) {
            // 饮料
            for (int j = 0; j < 44; j++) {
                // 钱刚好花光了，并且啤酒比饮料少
                if (2.3 * i + j * 1.9 == 82.3 && i < j) {
                    System.out.println("啤酒买了" + i);
                }
            }
        }
    }
}
