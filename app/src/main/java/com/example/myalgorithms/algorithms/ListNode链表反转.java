package com.example.myalgorithms.algorithms;

import android.util.ArrayMap;

/**
 * 单链表
 * value - 数据域
 * listNoe - 指针域
 */
public class ListNode链表反转 {
    Object value;
    ListNode链表反转 next;

    public ListNode链表反转(Object value, ListNode链表反转 next) {
        this.value = value;
        this.next = next;
    }


    static class Test {

        public static void main(String[] args) {

            ListNode链表反转 node5 = new ListNode链表反转(5, null);
            ListNode链表反转 node4 = new ListNode链表反转(4, node5);
            ListNode链表反转 node3 = new ListNode链表反转(3, node4);
            ListNode链表反转 node2 = new ListNode链表反转(2, node3);
            ListNode链表反转 node = new ListNode链表反转(1, node2);
            printListNode(node);
            ListNode链表反转 newHead = reverseList(node);
            System.out.println("反转链表");
            printListNode(newHead);
//            performSelf(modCount);

            ArrayMap<String,String> arrayMap = new ArrayMap<>();

        }


        private static int modCount = 3;

        private static int performSelf(int modCount) {
            System.out.println("modCount:" + modCount);
            modCount--;
            if (modCount <= 0) {
                return modCount;
            }
            int self = performSelf(modCount);
            System.out.println("self:" + self + ",modCount:" + modCount);
            return self;
        }


        private static void printListNode(ListNode链表反转 head) {
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
     */
    public static ListNode链表反转 reverseList(ListNode链表反转 head) {
        Object headValue = head.value;
        if (head == null || head.next == null)
            return head;
        Object headNext = head.next.value;
        ListNode链表反转 next = head.next;
        ListNode链表反转 new_head = reverseList(next);
        Object nextValue = next.value;
        next.next = head;
        head.next = null;
        return new_head;
    }
}
