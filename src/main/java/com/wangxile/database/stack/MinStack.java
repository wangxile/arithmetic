package com.wangxile.database.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/12/28
 * @Modified by:
 *
 *
 * 我现在需要实现一个栈，这个栈除了可以进行普通的push、pop操作以外，还可以进行getMin的操作，getMin方法被调用后，
 * 会返回当前栈的最小值，你会怎么做呢？你可以假设栈里面存的都是int整数
 *
 * 使用辅助栈来存储最小值。如果当前要push的值比辅助栈的min值要小，那在辅助栈push的值是最小值88
 * 总结：push和pop的时间复杂度都是O(1)，空间是O(n)。典型以空间换时间的例子。
 */
public class MinStack {

    private List<Integer> data = new ArrayList<Integer>();
    private List<Integer> mins = new ArrayList<Integer>();

    public void push(int num) {
        data.add(num);
        if (mins.size() == 0) {
            // 初始化mins
            mins.add(num);
        } else {
            // 辅助栈mins每次push当时最小值
            int min = getMin();
            if (num >= min) {
                mins.add(min);
            } else {
                mins.add(num);
            }
        }
    }

    public int pop() {
        // 栈空，异常，返回-1
        if (data.size() == 0) {
            return -1;
        }
        // pop时两栈同步pop
        mins.remove(mins.size() - 1);
        return data.remove(data.size() - 1);
    }

    public int getMin() {
        // 栈空，异常，返回-1
        if (mins.size() == 0) {
            return -1;
        }
        // 返回mins栈顶元素
        return mins.get(mins.size() - 1);
    }


}
