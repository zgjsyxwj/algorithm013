package week02;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 */
public class NaryTreeInorderTraversal {
    List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {


    }
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return result;
        }
        result.add(root.val);

        List<Node> children = root.children;

        if (children != null && children.size() > 0) {
            for (Node child : children
            ) {
                preorder(child);
            }
        }
        return result;

    }


}
