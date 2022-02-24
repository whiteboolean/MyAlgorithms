package com.example.myalgorithms.nk;

import com.example.myalgorithms.ListNode;

/**
 * 描述
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表 1->2->3->3->4->4->5  处理后为 1->2->5
 * <p>
 * 数据范围：链表长度满足 0 \le n \le 1000 \0≤n≤1000  ，链表中的值满足 1 \le val \le 1000 \1≤val≤1000
 * <p>
 * 进阶：空间复杂度 O(n)\O(n)  ，时间复杂度 O(n) \O(n)
 * <p>
 * 例如输入{1,2,3,3,4,4,5}时，对应的输出为{1,2,5}，对应的输入输出链表如下图所示：
 */
public class JZ76 {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode head = pHead;
        ListNode first = head;
        if (first.next == null) return head;
        ListNode second = head.next;
        ListNode lastFirst = null;
        while (head != null) {
            if (first == second) {
                second = second.next;


            }
        }

        return null;
    }
}
