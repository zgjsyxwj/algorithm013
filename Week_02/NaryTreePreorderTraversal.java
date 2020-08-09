package week02;

import java.util.ArrayList;
import java.util.List;

public class  NaryTreePreorderTraversal {
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
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
