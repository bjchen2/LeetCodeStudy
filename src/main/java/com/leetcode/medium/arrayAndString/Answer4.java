package com.leetcode.medium.arrayAndString;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * Created By Cx On 2019/1/31 11:59
 */
public class Answer4 {
    //todo 记录字母上一次出现的位置，滑动窗口算法(若出现重复字母，截止当前字串，比较长度)
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] index = new int[1000];
        int ans = 0,i = 0,begin = 0;
        for (;i < chars.length; i++){
            if (index[chars[i]] > begin){
                //如果该元素之前出现过，计算距离
                ans = ans > i - begin? ans : i - begin;
                begin = index[chars[i]];
            }
            //i+1,防止第0个元素误判
            index[chars[i]] = i + 1;
        }
        return ans > i - begin? ans : i - begin;
    }

    public static void main(String[] args) {
        Answer4 a = new Answer4();
        System.out.println(a.lengthOfLongestSubstring("abba"));
    }
}
