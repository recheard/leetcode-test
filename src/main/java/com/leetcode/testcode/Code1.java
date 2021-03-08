package com.leetcode.testcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code1 {

    @Test
    public void test() {
        int[] nums = {1, 4, 6, 8};
        nums = twoSum2(nums, 9);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     * 双重循环
     * @param nums 数组
     * @param target 合值
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    return new int[]{i, i1};
                }
            }
        }
        return null;
    }


    /**
     * hash表
     * @param nums 数组
     * @param target 合值
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(len - 1);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }














}
