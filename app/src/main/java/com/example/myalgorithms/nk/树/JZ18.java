package com.example.myalgorithms.nk.树;

import com.example.myalgorithms.ListNode;

public class JZ18 {
    public static void main(String[] args) {

    }


    private static ListNode algorithms(ListNode head, int val) {
        if (head.val == val){
            head = head.next;
            return head;
        }

        ListNode cur = head;
        while (cur.next!=null){
            if (cur.next.val ==val){
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return  head;

    }
}
