package com.leetcode.medium.math;

/**
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 2:
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 *
 * 说明:
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。本题中，如果除法结果溢出，则返回 2^31 − 1。
 * Created By Cx On 2019/3/22 21:30
 */
public class Answer6 {
    public int divide(int dividend, int divisor) {
        //temp用于暂存-2^31转换成正数以后溢出的1,flag用于存符号位；
        int ans = 0,temp = 0;
        boolean flag = (dividend & 0x80000000) == (divisor & 0x80000000);
        if (divisor == Integer.MIN_VALUE){
            return dividend == Integer.MIN_VALUE?1:0;
        }
        //先将被除数和除数转换成正整数
        if (dividend < 0){
            dividend = ~dividend;
            if(dividend != Integer.MAX_VALUE) dividend += 1;
            else temp = 1;
        }
        if (divisor < 0){
            divisor = (~divisor)+1;
        }
        //开始除
        while(dividend >= divisor){
            int i = 0;
            while((dividend >> i+1) > divisor) i++;
            ans += (1<<i);
            dividend -= divisor<<i;
        }
        //把溢出的加上
        dividend += temp;
        if (dividend >= divisor && ans < Integer.MAX_VALUE) ans += 1;
        //异号
        if (!flag) ans = (~ans)+(ans==Integer.MAX_VALUE?0:1);
        return ans;
    }
}
