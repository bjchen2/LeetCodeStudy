package com.leetcode.primary.string;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 所有输入只包含小写字母 a-z 。
 * 示例 1:
 * 输入: ["flower","flow","fligflowht"]
 * 输出: "fl"
 * Created By Cx On 2019/1/15 18:14
 */
public class String9 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        char[] a,b;
        a = strs[0].toCharArray();
        int index = a.length - 1;
        for (int i = 1 ; i < strs.length; i++){
            if (index < 0) return "";
            int temp = 0;
            b = strs[i].toCharArray();
            while(temp < b.length && temp <= index && a[temp] == b[temp] ) temp++;
            index = temp-1;
        }
        return String.valueOf(a,0,index+1);
    }
}
