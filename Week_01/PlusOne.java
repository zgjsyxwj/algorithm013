package week01;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 9, 9};
        int[] nums3 = new int[]{9, 9, 9};
        int[] result = new PlusOne().plusOne(nums3);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i]++;
            nums[i] = nums[i] % 10;
            if (nums[i] != 0) {
                return nums;
            }
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }

}
