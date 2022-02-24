package com.example.myalgorithms.nk;
import com.example.myalgorithms.ListNode;
import com.example.myalgorithms.Node;

import java.util.ArrayList;

import java.util.Stack;

/**
 * 判断是不是回文结构
 */
public class Nk1 {

    /**
     * 栈法
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            return new ArrayList<>();
        }
        Stack<Integer> stk = new Stack<>();
        while(listNode != null){
            stk.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        while(!stk.isEmpty()){
            arr.add(stk.pop());
        }

        return arr;
    }

    public static boolean printListFromTailToHead1(ListNode listNode){
        ListNode head = listNode;
        if (listNode == null) return true;
        Stack<Integer> sk = new Stack<>();
        while (listNode!=null){
            sk.push(listNode.val);
            listNode = listNode.next;
        }

        while (head!=null){
            Integer pop = sk.pop();
            if (pop != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }

//    public static boolean isPalindrome3(Node head){
//        if (head == null || head.next == null){
//            return true;
//        }
//        Node n1 = head;
//        Node n2 = head;
//        while (n2.next!=null && n2.next.next !=null){
//            n1 = n1.next ;
//            n2 = n2.next.next;
//        }
//    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println( printListFromTailToHead1(node1));
    }

}
