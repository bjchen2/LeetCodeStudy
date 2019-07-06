package com.leetcode.primary.math;

/**
 * 计数质数(1既不是质数也不是合数)
 * 统计所有小于非负整数 n 的质数的数量。
 * Created By Cx On 2019/1/27 14:14
 */
public class Math2 {
    //todo(非自己想出) 筛法求质数，效率最高，但会比较浪费内存（时间和空间复杂度都是O(n)）
    //要输出小于200以内的质数，建立一个大小为201（建立201个存储位置是为了让数组位置与其大小相同）的boolean数组，初始化为true。
    //遍历到根号n（因为在n之前的数若为合数，则必有一个因子小于根号n），
    // 若为true，将其倍数全改为false，如一开始将2的倍数改为false，接着3的倍数……
    public static int countPrimes(int n) {
        if (n < 2) return 0;
        int temp = (int) Math.sqrt(n*1.0),ans = 0,i;
        //默认初始化为全false
        boolean[] flags = new boolean[n+1];
        for (i = 2; i <= temp;i++){
            if (!flags[i]){
                int x = 2;
                while (i*x <= n){
                    flags[i*x++] = true;
                }
                ans++;
            }
        }
        while(i < n){
            if (!flags[i++]) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(3));
    }
}
