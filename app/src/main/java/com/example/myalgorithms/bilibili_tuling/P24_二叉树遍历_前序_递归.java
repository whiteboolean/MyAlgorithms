package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.TreeNode;

public class P24_二叉树遍历_前序_递归 {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        midOrder(node1);
    }

    public static void midOrder(TreeNode node){
        if (node==null){
            return;
        }
        System.out.println(node.val);
        midOrder(node.left);
        midOrder(node.right);
    }

}
