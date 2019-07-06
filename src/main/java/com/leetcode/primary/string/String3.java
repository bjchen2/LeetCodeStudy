package com.leetcode.primary.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "loveleetcode",
 * 返回 2.
 * 假设字符串只包含小写字母。
 * Created By Cx On 2019/1/10 17:45
 */
public class String3 {

    /**
     * 遍历a到z,比较第一次和最后一次出现是否相同，若相同，输出index小的
     */
    public int firstUniqChar(String s) {
        int res = -1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                res = (res == -1 || res > index) ? index : res;
            }
        }
        return res;
    }

    public int myFirstUniqChar(String s) {
        int[] a= new int[26];
        char[] ss = s.toCharArray();
        List<Integer> index = new ArrayList<>();
        for (int i = 0 ; i < s.length() ; i++){
            if (a[ss[i]-'a']++ == 0) {
                index.add(i);
            }
        }
        for (int i : index){
            if (a[ss[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
