package com.leetcode.primary.others;

import java.util.Date;

/**
 * 编写一个函数，输入是一个整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 示例 1：
 * 输入：11（00000000000000000000000000001011）
 * 输出：3
 *
 * 示例 2：
 * 输入：-3（11111111111111111111111111111101）
 * 输出：31
 * Created By Cx On 2019/1/27 15:50
 */
public class Others1 {
    //=============================答案=============================
    public int ans(int n) {
        int count =0;
        while(n!=0){
            //相当于每次将一个最低位的1变为0；
            n &= (n-1);
            count++;
        }
        return count;
    }

    //=============================我的=============================
    public int hammingWeight(int n) {
        int ans = 0;
        while(n != 0){
            ans += n&1;
            n = n >>> 1;
        }
        return ans;
    }
}
