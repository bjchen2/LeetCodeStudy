package com.leetcode.primary.string;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/37/
 * 字符串转换整数 (atoi)
 * 第一个非空字符为+、-、数字时有效
 * 若为+、-，则将其相连的数字转换，若无数字相连则返回0，如：+ 123、-w222
 * 若为数字，返回相连所有数
 * 否则返回0；
 * 说明：
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−2^31,  2^31 − 1]。
 * 如果数值超过这个范围，返回  INT_MAX (2^31 − 1) 或 INT_MIN (−2^31) 。
 * 示例 3:
 * 输入: "+133 224"
 * 输出: 133
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * Created By Cx On 2019/1/11 10:36
 */
public class String6 {

    public int myAtoi(String str) {
        char[] a = str.toCharArray();
        int index = 0;
        final int MAX = (1<<31)-1,MIN = -(1<<31);
        try {
            while (a[index] == ' '){
                index++;
            }
        }catch (IndexOutOfBoundsException e){
            return 0;
        }
        //验证除去空格后函数是否合法
        int flag = 1;
        //若有+、-先做标志然后+1
        if (a[index] == '-'){
            flag = -1;
            index++;
        }
        else if (a[index] == '+'){
            index++;
        }
        //判断是否为数字
        if ( index >= a.length || a[index] < '0' || a[index] > '9'){
            return 0;
        }
        //字符串合法，开始进行运算
        int ans = 0,max = flag>0?MAX:MIN;
        try {
            //用flag进行符号控制
            ans += flag*(a[index++]-'0');
            while('0' <= a[index] && a[index] <= '9'){
                int temp = flag*(a[index++]-'0'),bound = (max/10)*flag,tempAns = ans*flag;
                //乘flag保证用绝对值比较
                if (tempAns > bound || (tempAns==bound&&flag*temp > max%10*flag)){
                    return max;
                }
                ans = ans * 10 + temp;
            }
        }catch (IndexOutOfBoundsException e){
            return ans;
        }
        return ans;
    }
}
