package com.leetcode.primary.others;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y（0 ≤ x, y < 231.），计算它们之间的汉明距离。
 *
 *示例:
 * 输入: x = 1, y = 4
 * 输出: 2
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *则第2位和第四位不同，所以答案为2
 * Created By Cx On 2019/1/27 16:14
 */
public class Others2 {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        while(x != 0 || y != 0){
            if ((x&1) != (y&1)){
                ans++;
            }
            x = x>>>1;
            y = y>>>1;
        }
        return ans;
    }
}
