package com.example.myalgorithms.bilibili_tuling;

import com.example.myalgorithms.TreeNode;

/**
 * 时间复杂度 : O(n)
 * 空间复杂度: O(1)
 * <p>
 * 线索二叉树
 */
public class p31_二叉树遍历_morris {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        morrisPre(node1);
    }


    public static void morrisPre(TreeNode cur) {
        if (cur == null) {
            return;
        }
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            while (mostRight.right != null && mostRight.right != cur) {
                mostRight = mostRight.right;
            }
            if (mostRight.right == null) {
                mostRight.right = cur;
                cur = cur.left;
                continue;
            }else{// mostRight.right == cur 删除线索指针
                mostRight.right = null ;

            }
        }


    }
}
