package com.example.myalgorithms.bilibili_tuling;

import androidx.recyclerview.widget.AsyncListDiffer;

import com.example.myalgorithms.ListNode;
import com.example.myalgorithms.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 迭代
 */
public class P28_二叉树遍历_前序_迭代 {

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

    //根 左  右
    public static void priOrder(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                if (root != null) {
                    System.out.println(root.val);
                    stack.push(root.right);
                    stack.push(root.left);
                }

            }
        }
    }
}
