package week01;

import java.util.Arrays;


public class MoveZeros {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 0, 3, 12};
        int[] arr2 = new int[]{0};
        solution3(arr1);
        Arrays.stream(arr1).forEach(System.out::print);
    }


    public static void solution(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}
