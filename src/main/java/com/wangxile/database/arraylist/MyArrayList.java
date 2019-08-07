package com.wangxile.database.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/15
 * @Modified by:
 */
public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
    }

    Object[] objs = new Object[4];

    int size = 0; //集合大小

    public int getSize() {
        return size;
    }

    //添加
    public void add(Object value) {
        //添加之前先判断是否能够放下
        if (size >= objs.length) {
            Object[] temp = new Object[objs.length * 2];
            //数组复制
            for (int i = 0; i < objs.length; i++) {
                temp[i] = objs[i];
            }
            objs = temp;
        }

        objs[size] = value;
        size++;
    }

    public void set(int index, Object value) throws Exception {
        if (index < 0 && index >= size) {
            throw new Exception("超出范围");
        }
        objs[index] = value;
    }

    public Object get(int index) throws Exception {
        if (index < 0 && index >= size) {
            throw new Exception("超出范围");
        }
        return objs[index];
    }

    public void clear() {
        size = 0;
        objs = new Object[4];
    }

    public void removeAt(int index) throws Exception {
        if (index < 0 && index >= size) {
            throw new Exception("超出范围");
        }
        for (int i = index; i<size;i++){
            objs[i-1] = objs[i];
        }
    }
}
