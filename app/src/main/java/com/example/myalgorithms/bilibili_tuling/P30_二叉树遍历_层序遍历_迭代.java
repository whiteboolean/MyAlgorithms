package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 */
public class P30_二叉树遍历_层序遍历_迭代 {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        priOrder(node1);

    }

    //层序遍历
    public static void priOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node!=null){
                System.out.println(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }

    }

}
