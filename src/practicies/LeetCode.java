package practicies;

import java.util.*;

public class LeetCode {

    public static void main(String[] args) {
    }

    public static int majorityElement(int[] nums) {
        // value and count
        Map<Integer, Integer> majority = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (majority.containsKey(nums[i])) {
                majority.put(nums[i], majority.get(nums[i]) + 1);
            } else {
                majority.put(nums[i], 1);
            }
        }

        for (int i : majority.keySet()) {
            if (majority.get(i) > nums.length / 2) {
                return i;
            }
        }

        return 1;
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;

        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!duplicates.contains(nums[count])) {
                duplicates.add(nums[count]);
                count++;
            } else {
                nums[count] = nums[i + 1];
            }
        }

        return count;
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[nums2.length - (nums1.length - i)];
            }
        }

        Arrays.sort(nums1);

        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
