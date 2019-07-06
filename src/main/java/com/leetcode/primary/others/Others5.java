package com.leetcode.primary.others;

import java.util.*;

/**
 * Created By Cx On 2019/1/26 23:55
 */
public class Others5 {
    //=========================答案：若为左括号push右括号，若为右括号，出栈比较是否相等=======================
    public boolean ans(String s) {
        if (s == null || s.length() == 0)return true;
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            if (c == '('){
                stack.push(')');
            } else if(c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || c != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //=======================我的======================================
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ss = s.toCharArray(), right={'}',']',')'};
        int index;
        for (char c : ss){
            index = getIndex(c);
            if (index >= 0){
                //右括号入栈
                stack.push(c);
            }
            else if (stack.empty()){
                //左括号过多
                return false;
            }
            else{
                //左括号且栈不空
                index = getIndex(stack.pop());
                if (right[index] != c) return false;
            }
        }
        return stack.empty();
    }

    private int getIndex(char c){
        if (c == '{') return 0;
        if (c == '[') return 1;
        if (c == '(') return 2;
        else return -1;
    }

    public static void main(String[] args) {
        Others5 others5 = new Others5();
        System.out.println(others5.isValid("()[]{}"));
    }
}
