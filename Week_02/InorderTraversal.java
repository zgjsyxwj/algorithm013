package week02;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序 遍历。
 */
public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(4);
        root.left = left;
        TreeNode right = new TreeNode(3);
        root.right = right;

        TreeNode rightChildren = new TreeNode(2);
        right.right = rightChildren;

        new InorderTraversal().inorderTraversal(root).forEach(System.out::println);
    }

    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inOrder(root, list);
    }

    //左-根-右
    private List<Integer> inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }

        inOrder(root.left, list);

        list.add(root.val);

        inOrder(root.right, list);
        return list;
    }
}
