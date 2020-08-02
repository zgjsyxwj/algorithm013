package week01;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        new MergeTwoSortedArrays().solution(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.println(num);
        }
    }

    public void solution(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, len = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            int large = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
            nums1[len] = large;
            len--;
        }
        if (p2 >=0) {
            //将nums2剩余元素拷贝至nums1开头，结束位置为剩余元素个数-1
            System.arraycopy(nums2, 0, nums1, 0, p2 - 1);
        }

    }
}
