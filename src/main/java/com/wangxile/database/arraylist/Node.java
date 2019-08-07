package com.wangxile.database.arraylist;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/15
 * @Modified by:
 */
public class Node {
    Object value;
    Node nextNode;

    public Node(Object value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
