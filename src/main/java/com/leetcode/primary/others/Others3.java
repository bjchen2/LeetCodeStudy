package com.leetcode.primary.others;

/**
 * 颠倒给定的 32 位整数(可能是负数)的二进制位。
 *
 * 示例 1：
 * 输入: 00000010100101000001111010011100
 * 输出: 00111001011110000010100101000000
 * 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 *       因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 * Created By Cx On 2019/1/27 16:41
 */
public class Others3 {
    public static int reverseBits(int n) {
        int ans = (n&1);
        for (int i = 0; i < 31;i++){
            n = n >>> 1;
            ans = ans<<1;
            ans += (n&1);
        }
        return ans;
    }
}
