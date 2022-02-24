package com.example.myalgorithms.nk;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class JZ35 {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static void main(String[] args) {

    }

    private static RandomListNode copy(RandomListNode node) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode head = node;
        while (head != null) {
            map.put(head, new RandomListNode(node.label));
            head = head.next;
        }
        head = node;
        while (head != null) {
            map.get(head).next = map.get(head.next);
            map.get(head).random = map.get(head.random);
            head = head.next;
        }
        return map.get(node);
    }

    /**
     * 面试
     *
     * @param node
     * @return
     */
    private static RandomListNode copy2(RandomListNode node) {
        if (node == null) {
            return null;
        }

        RandomListNode cur = node;
        RandomListNode next = null;
        //1 -> 2
        //1 -> 1` -> 2 -> 2`
        while (cur != null) {
            next = cur.next;
            cur.next = new RandomListNode(cur.label);
            cur.next.next = next;
            cur = next;
        }
        cur = node;
        RandomListNode curCopy = null;
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            curCopy.random = cur.random != null ? cur.random .next: null;
            cur = next;
        }
        RandomListNode res = node.next;
        cur = node;
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            cur.next = next;
            curCopy.next = next != null ? next.next : null;
            cur = next;
        }
        return res;

    }
}
