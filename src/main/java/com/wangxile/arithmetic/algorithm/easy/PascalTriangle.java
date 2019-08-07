package com.wangxile.arithmetic.algorithm.easy;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/1/2
 * @Modified by:
 *
 * 打印杨辉三角
 *
 * 进一步推算：第1列全部为1，第一行全都是1，当列数等于行数为1
 * 当前值等于头上的值加头上的左边的值
 * 第一行一列，第二行两列，第三行三列.......
 *
 */

public class PascalTriangle {
    public static void pascalTriangle(){
        //打印十行杨辉三角
        int[][] arrays = new int[10][];

        for(int i = 0; i < arrays.length; i++){
            //初始化第二维度数组
            arrays[i] = new int[i+1];

            //是第一列，第一行，行数等于列数，那么通通为1
            for(int j = 0; j <= i; j++){
                if(i == 0 || j == 0 || j == i){
                    arrays[i][j] = 1;
                }else{
                    //当前值等于头上的值+头上左边的值
                    arrays[i][j] = arrays[i-1][j] + arrays[i-1][j-1];
                }
            }
        }

        for(int[] array : arrays){
            for(int value : array){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascalTriangle();
    }
}
