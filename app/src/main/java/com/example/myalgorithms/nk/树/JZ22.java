package com.example.myalgorithms.nk.树;

import com.example.myalgorithms.ListNode;
import com.example.myalgorithms.Node;

import java.util.Stack;

/**
 *
 描述
 输入一个长度为 n 的链表，设链表中的元素的值为 ai ，返回该链表中倒数第k个节点。
 如果该链表长度小于k，请返回一个长度为 0 的链表。

 要求：空间复杂度 O(n)O(n)，时间复杂度 O(n)O(n)
 进阶：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)

 例如输入{1,2,3,4,5},2时，对应的链表结构如下图所示：

 其中蓝色部分为该链表的最后2个结点，所以返回倒数第2个结点（也即结点值为4的结点）即可，系统会打印后面所有的节点来比较。
 */
public class JZ22 {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println( FindKthToTail(node1,2).val);
    }


    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public static ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
      Stack<ListNode> stack = new Stack<>();
      ListNode node = pHead;
      while(node!=null){
          stack.push(node);
          node = node.next;
      }
      if (stack.size()<k){
          return null;
      }
        for (int i = 0; i < k; i++) {
            node = stack.pop();
        }
        return node;
    }

    public static ListNode FindKthToTail1 (ListNode pHead, int k) {
        // write code here
        if (pHead==null) return pHead;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(k-->0){
            if (fast==null) return null;
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
