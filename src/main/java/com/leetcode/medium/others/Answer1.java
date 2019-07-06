package com.leetcode.medium.others;

/**
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 2:
 * 输入: a = -2, b = 3
 * 输出: 1
 * Created By Cx On 2019/3/22 23:45
 */
public class Answer1 {
    public int getSum(int a, int b) {
        while (b != 0){
            int t = b;
            b = (a&b)<<1;
            a = a^t;
        }
        return a;
    }

    public static void main(String[] args) {
        Answer1 a = new Answer1();
        System.out.println(a.getSum(188311,555));
    }
}
