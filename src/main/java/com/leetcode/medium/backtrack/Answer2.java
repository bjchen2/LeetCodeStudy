package com.leetcode.medium.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 * Created By Cx On 2019/3/16 10:21
 */
public class Answer2 {
    private List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        add(n,0,"");
        return ans;
    }

    private void add(int n,int a,String str){
        if (a == 0 && n == 0) ans.add(str);
        if (n > 0) add(n-1,a+1,str+"(");
        if (a > 0) add(n, a-1,str+")");
    }
}
