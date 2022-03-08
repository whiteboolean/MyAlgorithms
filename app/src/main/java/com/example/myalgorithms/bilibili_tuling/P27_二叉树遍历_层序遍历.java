package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

public class P27_二叉树遍历_层序遍历 {


    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        ArrayList<Integer> list = new ArrayList<>();
        priOrder(node1, 1, list);
        System.out.println(Arrays.toString(list.toArray()));

    }

    public static void priOrder(TreeNode root, int i, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        int length = list.size();
        if (length <= i) {
            for (int j = 0; j <= i - length; j++) {
                list.add(length + j, null);
            }
        }
        list.set(i, root.val);
        priOrder(root.left, 2 * i, list);
        priOrder(root.right, 2 * i + 1, list);

    }
}
