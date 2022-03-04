package com.example.myalgorithms.algorithms;

import android.util.ArrayMap;

/**
 * 单链表
 * value - 数据域
 * listNoe - 指针域
 */
public class ListNodeReserve {
    Object value;
    ListNodeReserve next;

    public ListNodeReserve(Object value, ListNodeReserve next) {
        this.value = value;
        this.next = next;
    }


    static class Test {

        public static void main(String[] args) {

//            ListNodeReserve node5 = new ListNodeReserve(5, null);
//            ListNodeReserve node4 = new ListNodeReserve(4, node5);
            ListNodeReserve node3 = new ListNodeReserve(3, null);
            ListNodeReserve node2 = new ListNodeReserve(2, node3);
            ListNodeReserve node = new ListNodeReserve(1, node2);
            printListNode(node);
            ListNodeReserve newHead = reverseList(node);
            System.out.println("----- 反转链表 ------");
            printListNode(newHead);
//            performSelf(modCounts);

//            ArrayMap<String,String> arrayMap = new ArrayMap<>();

        }


//        private static final int modCounts = 3;
//
//        private static int performSelf(int modCount) {
//            System.out.println("modCount:" + modCount);
//            modCount--;
//            if (modCount <= 0) {
//                return modCount;
//            }
//            int self = performSelf(modCount);
//            System.out.println("self:" + self + ",modCount:" + modCount);
//            return self;
//        }


        private static void printListNode(ListNodeReserve head) {
            if (head == null) return;

            System.out.println("NodeValue:" + head.value);
            printListNode(head.next);
        }
    }


    /*
     * 206. 反转链表 反转一个单链表。
     *
     * 示例: 输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL
     *
     *
     * 1 -> 2 -> 3 -> 4 -> 5 -> null
     * null <- 1 <- 2 <- 3 <- 4 <- 5 < - null
     *
     * https://www.bilibili.com/video/BV1YL411c7vn/?spm_id_from=autoNext
     */
    public static ListNodeReserve reverseList(ListNodeReserve head) {
        if (head == null || head.next == null)
            return head;
        ListNodeReserve new_head = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return new_head;
    }

//
//    public static ListNodeReserve reserveList2(ListNodeReserve head) {
//        return reserveList(head, null);
//    }
//
//    public static ListNodeReserve reserveList(ListNodeReserve head, ListNodeReserve newHead) {
//        if (head == null) return newHead;
//        ListNodeReserve next = head.next;
//        head.next = newHead;
//        return reserveList(next, head);
//    }
//
//





}
