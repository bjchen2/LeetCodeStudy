package com.leetcode.primary.string;

import java.util.Arrays;
import java.util.List;

/**
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 * 示例 2:
 * 输入: 4
 * 输出: "1211"
 * Created By Cx On 2019/1/15 17:44
 */
public class String8 {

    public String countAndSay(int n) {
        List<String> ss = Arrays.asList("1", "11", "21", "1211", "111221");
        if (n <= 5) return ss.get(n-1);
        String s = ss.get(4);
        StringBuilder temp;
        int count = 1;
        for (int i = 5;i < n; i++){
            int length = s.length();
            char[] a = s.toCharArray();
            temp = new StringBuilder();
            count = 1;
            for (int j = 0; j < length; j++){
                if (j != length-1 && a[j] == a[j+1]){
                    count++;
                }else {
                    temp.append(count).append(a[j]);
                    count = 1;
                }
            }
            s = temp.toString();
        }
        return s;
    }

}
