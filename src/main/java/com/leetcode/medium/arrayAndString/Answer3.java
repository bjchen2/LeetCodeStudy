package com.leetcode.medium.arrayAndString;

import java.util.*;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 示例:
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 说明：
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 * Created By Cx On 2019/1/30 21:06
 */
public class Answer3 {
    //todo（非本人想出） 只要字符串包含字母相同，排序后的字符串一定相同
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        char[] temp;
        String tempS;
        for (String s : strs){
            temp = s.toCharArray();
            Arrays.sort(temp);
            tempS = String.valueOf(temp);
            if (!m.containsKey(tempS)){
                m.put(tempS,new ArrayList<>());
            }
            m.get(tempS).add(s);
        }
        return new ArrayList<>(m.values());
    }

    public static void main(String[] args) {
        List<String> s = Collections.singletonList("a");
        s.add("b");

    }
}
