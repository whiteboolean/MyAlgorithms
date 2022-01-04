package com.example.myalgorithms.algorithms;

/**
 * 单链表
 * value - 数据域
 * listNoe - 指针域
 */
public class ListNode {
    Object value;
    ListNode next;

    public ListNode(Object value, ListNode next) {
        this.value = value;
        this.next = next;
    }


    static class Test {

        public static void main(String[] args) {

            ListNode node5 = new ListNode(5, null);
            ListNode node4 = new ListNode(4, node5);
            ListNode node3 = new ListNode(3, node4);
            ListNode node2 = new ListNode(2, node3);
            ListNode node = new ListNode(1, node2);
            printListNode(node);
            ListNode newHead = reverseList(node);
            System.out.println("反转链表");
            printListNode(newHead);
//            performSelf(modCount);
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


        private static void printListNode(ListNode head) {
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
    public static ListNode reverseList(ListNode head) {
        Object headValue = head.value;
        if (head == null || head.next == null)
            return head;
        Object headNext = head.next.value;
        ListNode next = head.next;
        ListNode new_head = reverseList(next);
        Object nextValue = next.value;
        next.next = head;
        head.next = null;
        return new_head;
    }
}
