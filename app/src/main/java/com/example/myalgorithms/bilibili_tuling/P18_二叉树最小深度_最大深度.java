package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.TreeNode;

/**
 * 二叉树的最小深度
 * <p>
 * 给定一个二叉树，找出其最小深度
 * 最小深度是从根节点到最近叶子结点的最短路径上的结点数量。
 * 深度优先，广度优先
 * <p>
 * 深度优先： 找到每一个叶子节点然后记录叶子节点的深度，然后从叶子节点往上进行查找，遍历
 * 一直遍历到根节点，然后求出每一个节点的深度
 * <p>
 * 广度优先：
 */
public class P18_二叉树最小深度_最大深度 {

    /**
     * @param args 1
     *             2     3
     *             4   5  6
     *             7
     */
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, node7, null);
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, node6, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        System.out.println(minDepth(node1));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) {
            return 1;
        }
        //每个节点的最小深度
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right != null) {
            min = Math.min(minDepth(root.right), min);
        }
        return min + 1;
    }


}
