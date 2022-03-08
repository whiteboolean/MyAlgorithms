package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.ListNode;
import com.example.myalgorithms.TreeNode;

/**
 *
 * 左右根
 *
 *
 */
public class P26_二叉树遍历_后序_递归 {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        backOrder(node1);
    }

    public static void backOrder(TreeNode node){
        if (node==null){
            return;
        }
        backOrder(node.left);
        backOrder(node.right);
        System.out.println(node.val);
    }
}
