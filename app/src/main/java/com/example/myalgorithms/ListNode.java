package com.example.myalgorithms;

public class ListNode {
     public int val ;
     public ListNode next ;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next) {
        this.next = next;
    }

    public ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }
}
