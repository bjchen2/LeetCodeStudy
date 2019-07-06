package com.leetcode.primary.string;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 假设字符串只包含小写字母
 * Created By Cx On 2019/1/10 18:12
 */
public class String4 {

    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        if (s.length() != t.length()){
            return false;
        }
        char[] x = s.toCharArray(),y = t.toCharArray();
        for (int i = 0;i < s.length();i++){
            a[x[i]-'a']++;
            a[y[i]-'a']--;
        }
        for (int i : a){
            if (i != 0) return false;
        }
        return true;
    }
}
