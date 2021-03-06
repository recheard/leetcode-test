package com.leetcode.testcode;

import org.junit.Test;

import java.util.*;

/**
 * 503. 下一个更大元素 II
 *
 */
public class Code503 {

    @Test
    public void test () {
        int[] nums = {5,4,3,2,1};
        nums = nextGreaterElements(nums);
        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }

    public int[] nextGreaterElements(int[] nums) {
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (true) {
                if (j >= nums.length) {
                    j = 0;
                }
                if (j == i) {
                    numbers[i] = -1;
                    break;
                }
                if (nums[i] < nums[j]) {
                    numbers[i] = nums[j];
                    break;
                } else {
                    j++;
                }
            }
        }
        return numbers;
    };



}
