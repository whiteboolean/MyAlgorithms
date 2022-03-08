package com.example.myalgorithms.bilibili_tuling_practice;

import com.example.myalgorithms.ListNode;

/**
 * 链表反转
 */
public class P01_链表反转_迭代 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        int prev = reverse(node1).val;
        System.out.println(prev);
    }

    //todo 练习 2022年03月08日11:57:51
    public static ListNode reverse(ListNode node){
        ListNode prev = null, next ,curr = node;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }




}
