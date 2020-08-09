package week02;

import java.util.ArrayList;
import java.util.List;

/**
 *144. 二叉树的前序遍历
 * 给定一个二叉树，返回它的 前序 遍历。
 */
public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(4);
        root.left = left;
        TreeNode right = new TreeNode(3);
        root.right = right;

        TreeNode rightChildren = new TreeNode(2);
        right.right = rightChildren;

        new PreorderTraversal().preorderTraversal(root).forEach(System.out::println);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return preOrder(root, list);
    }

    //根-左-右
    public List<Integer> preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }

        list.add(root.val);
        preOrder(root.left, list);

        preOrder(root.right, list);
        return list;
    }
}
