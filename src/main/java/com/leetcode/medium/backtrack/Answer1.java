package com.leetcode.medium.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * Created By Cx On 2019/3/15 13:04
 */
public class Answer1 {
    private List<String> ans = new ArrayList<>();
    private char[] cs;
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return ans;
        cs = digits.toCharArray();
        add(0,"");
        return ans;
    }

    private void add(int idx,String s){
        if (idx == cs.length){
            ans.add(s);
            return;
        }
        for (int i = 0; i < 3;i++){
            char c = (char) ((cs[idx]-'2')*3+'a'+i);
            if(cs[idx] == '8') c++;
            add(idx+1,s + c);
        }
        if (cs[idx] == '7') add(idx+1,s + (char)((cs[idx]-'2')*3+'a') + 3);
        if (cs[idx] == '9') add(idx+1,s + (char)((cs[idx]-'2')*3+'a') + 4);
    }
}
