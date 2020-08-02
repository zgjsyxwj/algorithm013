package week01;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new RotateArray().solution(nums, k);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public void solution(int[] nums, int k) {
        int len = nums.length, last;
        for (int i = 0; i < k; i++) {
            last = nums[len - 1];
            //从右向左替换
            for (int j = len - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = last;
        }
    }
}
