package com.leetcode.testcode;

import org.junit.Test;

/**
 * 7. 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 *
 * 输入：x = 0
 * 输出：0
 *
 *
 * 提示：
 *
 * -231 <= x <= 231 - 1
 */
public class Code7 {


    @Test
    public void test () {
        System.out.println(reverse(123));
    }

    public int reverse(int x) {
        if (x >= -9 && x <= 9) {
            return x;
        }
        int y = 0;
        while (x != 0) {
            if (y < 0) {
                if (Integer.MIN_VALUE / 10 > y) {
                    return 0;
                } else if (Integer.MIN_VALUE / 10 == y && Integer.MIN_VALUE % 10 > x % 10) {
                    return 0;
                }
            } else if (x > 0) {
                if (Integer.MAX_VALUE / 10 < y) {
                    return 0;
                } else if (Integer.MAX_VALUE / 10 == y && Integer.MAX_VALUE % 10 < x % 10) {
                    return 0;
                }
            }
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }


}
