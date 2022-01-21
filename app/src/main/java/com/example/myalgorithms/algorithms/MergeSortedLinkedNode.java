package com.example.myalgorithms.algorithms;

public class MergeSortedLinkedNode {

    public static void main(String[] args) {


    }


    private static LinkedNode mergeNode(LinkedNode node1, LinkedNode node2) {
        //TEMP
        LinkedNode node = new LinkedNode(0);

        //临时的头结点
        LinkedNode temp = node;

        while (node1 != null && node2 != null) {
            if (node1.node < node2.node) {
                temp.next = node1;
                node1 = node1.next;
            } else {
                temp.next = node2;
                node2 = node2.next;
            }
            temp = temp.next;
        }

        if (node1 != null) {
            temp.next = node1;
        }
        if (node2 != null) {
            temp.next = node2;
        }
        return node.next;


    }

    private static class ListNode {
        public LinkedNode head;

        //尾插建立链表
        public void addLast(int data) {
            LinkedNode node = new LinkedNode(data);
            if (head == null) {
                this.head = node;
            } else {
                LinkedNode cur = this.head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = node;
            }
        }
    }


    private static class LinkedNode {
        public int node;
        public LinkedNode next;

        public LinkedNode(int node) {
            this.node = node;
        }
    }
}
