package com.altho;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TwoSums {
    public static void main(String[] args) {
        int[] sums = {7, 11, 2, 4, 3, 5, 8, 7, 2};
        int[] twoSum = twoSum(sums, 13);
        System.out.println(Arrays.toString(twoSum));
    }

    public static int[] twoSum(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap();
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        while (true) {
            int i = random.nextInt(nums.length);
            int j = random.nextInt(nums.length);
            if (i == j) {
                continue;
            }
            int[] sum = {i, j};
            int[] dig = {j, i};
            if (map.get(i) + map.get(j) == target) {
                if (i > j) {
                    return dig;
                }
                return sum;
            }
        }
    }


}
