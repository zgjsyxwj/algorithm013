package week03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 77. 组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */
public class FindCombinations {

    private List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        List<List<Integer>> combine = new FindCombinations().combine(4, 2);
        combine.stream().forEach(System.out::println);
    }

    //按顺序往后取，避免重复
    private void findCombinations(int n, int k, int begin, Stack<Integer> pre) {
        //terminator ：stack长度达到k个
        if (pre.size() == k) {
            res.add(new ArrayList<>(pre));
            return;
        }
        // 从begin到n中取
        for (int i = begin; i <= n; i++) {
            //process logic
            pre.add(i);
            //drill down
            findCombinations(n, k, i + 1, pre);
            //reverse
            pre.pop();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        if (n == 0 || k == 0 || n <= k) {
            return res;
        }
        findCombinations(n, k, 1, new Stack<>());
        return res;
    }
}
