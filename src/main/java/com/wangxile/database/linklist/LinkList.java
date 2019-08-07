package com.wangxile.database.linklist;
  public class LinkList {
      public Node head;
      public Node current;
  
      //方法：向链表中添加数据
      public void add(int data) {
          //判断链表为空的时候 如果头结点为空，说明这个链表还没有创建，那就把新的结点赋给头结点
         if (head == null) {
              head = new Node(data);
             current = head;
         } else {
             //创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
            current.next = new Node(data);
             //把链表的当前索引向后移动一位 此步操作完成之后，current结点指向新添加的那个结点
             current = current.next;
         }
     }
 
     //方法：遍历链表（打印输出链表。方法的参数表示从节点node开始进行遍历
     public void print(Node node) {
         if (node == null) {
             return;
         }
 
         current = node;
         while (current != null) {
             System.out.println(current.data);
             current = current.next;
         }
     }
     
     public static Node re(Node head){
    	Node cur = null;
    	while(head != null){
    		Node next = head.next;
    		head.next = cur;
    		cur = head;
    		head = next;
    	}
		return cur;
     }
 
     public static void main(String[] args) {
         LinkList list = new LinkList();
         //向LinkList中添加数据
         for (int i = 0; i < 10; i++) {
             list.add(i);
         }
         //list.print(list.head);// 从head节点开始遍历输出
         list.print(re(list.head));
     }
 
 }