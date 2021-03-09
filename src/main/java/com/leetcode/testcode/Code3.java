package com.leetcode.testcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 *
 *
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class Code3 {

    @Test
    public void test() {
        String str = "abcabcbb";
        int maxLength = lengthOfLongestSubstring2(str);
        System.out.println(maxLength); ;
    }

    /**
     * hashset记录所有可能出现的组合，再获取最长的字符串的长度
     * @param s 输入字符串
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;
        if (null == s || "".trim().equals(s)) {
            return maxLength;
        }
        String[] array = s.split("");
        String str = "";
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < array.length; i++) {
            int index = str.indexOf(array[i]);
            if ( index>= 0) {
                str = str.substring(index + 1);
            }
            str += array[i];
            set.add(str);
        }
        for (String s1 : set) {
            if (s1.length() > maxLength) {
                maxLength = s1.length();
            }
        }
        return maxLength;
    }

    /**
     * 每次判断分割后的组合字符串是否包含该字符，
     * 如果包含则判断是否为最大长度，
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        int maxLength = 0;
        if (null == s || "".trim().equals(s)) {
            return maxLength;
        }
        String[] array = s.split("");
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            int index = str.indexOf(array[i]);
            if ( index>= 0) {
                str = str.delete(0, index + 1);
            }
            str.append(array[i]);
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }







}
