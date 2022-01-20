package com.example.myalgorithms.algorithms;

public class MergeSortedLinkedNode {

    public static void main(String[] args) {


    }


    private static void mergeNode(LinkedNode node1,LinkedNode node2){

        //TEMP
        LinkedNode node = new LinkedNode(0);

        //f
        LinkedNode temp ;


    }

    private static class ListNode{
        public static LinkedNode head;

        //尾插建立链表
        public static void addLast(int data) {
            LinkedNode node = new LinkedNode(data);
            if (head == null) {
                this.head = node;
            } else {
                ListNode cur = this.head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = node;
            }
        }

    }


    private static class LinkedNode{
        public Object node;
        public LinkedNode Next;

        public LinkedNode(Object node) {
            this.node = node;
        }
    }
}
