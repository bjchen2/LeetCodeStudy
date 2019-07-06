package com.leetcode.medium.math;

/**
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 * Created By Cx On 2019/2/12 16:41
 */
public class Answer5 {
    public static int mySqrt(int x) {
        if (x <= 1) return x;
        int l = 0,r = x;
        while(l < r){
            int mid = l + (r-l>>1);
            if (x/mid < mid){
                //不能写成mid-1，否则无法知道是因为哪个if语句造成的条件不满足
                r = mid;
            }else if(x/mid > mid){
                l = mid+1;
            }else {
                return mid;
            }
        }
        return r-1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
