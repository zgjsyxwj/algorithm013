package week03;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class AllSorts {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> lists = new AllSorts().permute(nums);
        System.out.println(lists);

    }
    public List<List<Integer>> permute(int[] nums) {
        // 首先是特判
        int len = nums.length;
        // 使用一个动态数组保存所有可能的全排列
        List<List<Integer>> res = new ArrayList<>();

        if (len == 0) {
            return res;
        }
        boolean[] used = new boolean[len];
        List<Integer> interResult = new ArrayList<>();

        dfs(nums, len, 0, interResult, used, res);
        return res;
    }

    /**
     *
     * @param nums
     * @param len 数组长度
     * @param depth 深度
     * @param interResult 中间结果
     * @param used 已使用
     * @param res 最终结果
     */
    private void dfs(int[] nums, int len, int depth,
                     List<Integer> interResult, boolean[] used,
                     List<List<Integer>> res) {
        //terminator :深度等于数组长度
        if (depth == len) {
            res.add(new ArrayList<>(interResult));
            return;
        }

        for (int i = 0; i < len; i++) {
            //遍历
            if (!used[i]) {
                //process logic
                interResult.add(nums[i]);
                used[i] = true;

                //drill down
                dfs(nums, len, depth + 1, interResult, used, res);

                //reverse states
                used[i] = false;
                interResult.remove(interResult.size() - 1);
            }
        }
    }

}
