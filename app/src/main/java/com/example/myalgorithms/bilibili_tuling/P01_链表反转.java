package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.ListNode;
import com.example.myalgorithms.algorithms.ListNodeReserve;

public class P01_链表反转 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        int prev = reverse2(node1).val;
        System.out.println(prev);
    }


    private static ListNode reverse(ListNode node) {
        ListNode prev = null, next;
        ListNode curr = node;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    private static ListNode reverse2(ListNode node){
        if (node==null || node.next == null) return node;
        ListNode head = reverse2(node.next);
        node.next.next = node;
        node.next = null;
        return head;
    }

}
