package week01;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = new RemoveDuplicates().solution2(nums);
        for (int i = 0; i < len; i++) {
            System.out.println((nums[i]));
        }
    }


    public int solution(int[] nums) {

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
