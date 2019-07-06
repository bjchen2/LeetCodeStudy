package com.leetcode.primary.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 *  todo 判断3的倍数：划掉0、3、6、9，剩余数加起来，若是3的倍数，则是3的倍数，如：12345678->124578->27所以是3的倍数
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * 示例：
 * n = 15,
 * 返回:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 * Created By Cx On 2019/1/25 22:51
 */
public class Math1 {
    //=========================答案============================
    public List<String> ans(int n) {
        return new java.util.AbstractList<String>() {
            @Override
            public String get(int index) {
                index++;

                if (index % 3 == 0) {
                    if (index % 5 == 0) {
                        return "FizzBuzz";
                    }
                    return "Fizz";
                }
                if (index % 5 == 0) {
                    return "Buzz";
                }
                return index + "";
            }

            @Override
            public int size() {
                return n;
            }
        };
    }


    //===========================我的=============================
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        final String s = "Fizz", s2="Buzz", s3="FizzBuzz";
        for (int i = 1 ; i <= n ; i++){
            if (i%3 == 0 && i%5 == 0){
                ans.add(s3);
            }
            else if (i%3 == 0){
                ans.add(s);
            }
            else if (i%5 == 0){
                ans.add(s2);
            }
            else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
