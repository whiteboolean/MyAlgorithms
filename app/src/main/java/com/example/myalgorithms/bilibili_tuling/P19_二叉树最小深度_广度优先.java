package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class P19_二叉树最小深度_广度优先 {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, node7, null);
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, node6, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        System.out.println(minDepth1(node1));
    }

    /**
     * 时间复杂度 0(N) 每个节点只取一次
     * 空间复杂度 -  取决于树的高度 ，容器的元素 O(N) / O(LogN)
     *
     *
     *
     * @param root
     * @return
     */

    public static int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        root.deep = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) return 0;
            if (node.left == null && node.right == null) {
                return node.deep;
            }
            if (node.left != null) {
                node.left.deep = node.deep + 1;
                queue.offer(node.left);
            }
            if (node.right != null) {
                node.right.deep = node.deep + 1;
                queue.offer(node.right);
            }
        }
        return 0;
    }


}
