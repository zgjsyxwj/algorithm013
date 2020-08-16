package week03;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */

public class GenerateParenthesis {
    List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        new GenerateParenthesis().generateParenthesis(3);
    }

    public List<String> generateParenthesis(int n) {
        _generate(0, 0, n, "");
        return result;
    }

    private void _generate(int left, int right, int n, String s) {
        if (left == n && right == n) {
            result.add(s);
            System.out.println(s);
            return;
        }
        if (left < n) {
            _generate(left + 1, right, n, s + "(");
        }
        if (right < left) {
            _generate(left, right + 1, n, s + ")");
        }
    }
}
