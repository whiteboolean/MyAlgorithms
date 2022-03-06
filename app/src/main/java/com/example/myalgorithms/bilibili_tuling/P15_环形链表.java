package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表
 * 给定一个链表，判断链表中是否有环
 * 链表中有某个节点，可以通过连续跟踪next指针再次到达该节点，则链表中
 * 存在环
 * <p>
 * 如果链表中存在环则返回true，否则，返回false
 */
public class P15_环形链表 {

    /**
     * 简单实现
     */

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

//       listNode5.next = listNode3;
        System.out.println(hasCycle(listNode1));
    }

    private static boolean hasCycle(ListNode listNode1) {
        //最简单的实现方法
        // 时间复杂度O(N)
        // 空间复杂度0(N)
        Set<ListNode> set = new HashSet<>();
        while (listNode1 != null) {
            if (!set.add(listNode1)) {
                return true;
            }
            listNode1 = listNode1.next;
        }

        return false;
    }

    //快慢指针
    // 快指针一次走两步 ， 慢指针一次走一步
    private static boolean hasCycle1(ListNode head) {
        if (head == null || head.next ==null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
