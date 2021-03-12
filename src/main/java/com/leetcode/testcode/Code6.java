package com.leetcode.testcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Z 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 *
 *
 * 示例 1：
 *
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 示例 3：
 *
 * 输入：s = "A", numRows = 1
 * 输出："A"
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 由英文字母（小写和大写）、',' 和 '.' 组成
 * 1 <= numRows <= 1000
 */
public class Code6 {

    @Test
    public void test () {
        String s = "PAYPALISHIRING";
        System.out.print(convert(s, 4));
    }

    /**
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() < numRows) {
            return s;
        }
        List<StringBuffer>  list = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuffer());
        }
        int index = 0;
        boolean bool = true;
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            list.get(index).append(str[i]);
            if (index == 0) {
                bool = true;
            }else if (index == numRows - 1) {
                bool = false;
            }
            if (bool) {
                index++;
            } else {
                index--;
            }
        }
        StringBuffer buffer = new StringBuffer();
        for (StringBuffer stringBuffer : list) {
            buffer.append(stringBuffer);
        }
        return buffer.toString();
    }

}
