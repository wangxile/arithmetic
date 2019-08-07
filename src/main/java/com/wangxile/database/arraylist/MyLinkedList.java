package com.wangxile.database.arraylist;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2018/10/15
 * @Modified by:
 */
public class MyLinkedList {
    int size;
    Node head = null;
    Node current = null;

    public int getSize() {
        return size;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;//当前节点
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            //循环结束:temp表示最后一个节点
            current.setNextNode(newNode);
        }
        size++;
    }

    public void set(int index, Object value) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        //current定位到指定位置
        current.setValue(value);
    }

    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        //current定位到指定位置
        return current.getValue();
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeAt(int index) {
        //删除头元素
        if (index == 0) {
            head = head.getNextNode();
        } else {
            //找到删除元素的前一个元素
            for (int i = 0; i < index - 1; i++) {
                current = current.getNextNode();
            }
            current.setNextNode(current.getNextNode().getNextNode());
        }
    }
}
