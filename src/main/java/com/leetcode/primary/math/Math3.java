package com.leetcode.primary.math;

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 * todo（非本人想出） ： log3为底n的对数是整数（通过换底公式log3N=logxN/logx3）——可推广到求是否为n的幂
 * 如果求2的幂只要n&(n-1)=0即可（因为2的幂次方只有首位为1）
 * Created By Cx On 2019/1/27 15:11
 */
public class Math3 {
    //注意：math.log10正确，但math.log不对，可能是底层的问题
    public static boolean isPowerOfThree(int n) {
        double d = Math.log10(n)/Math.log10(3);
        return d - Math.ceil(d) == 0;
        //解法2：因为整数范围3的最大幂为3^19 = 1162261467
       // return n>0&&1162261467%n==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(243));
    }
}
