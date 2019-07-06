package com.leetcode.primary.string;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * Created By Cx On 2019/1/10 18:31
 */
public class String5 {
    private boolean isInvalid(char x){
        return ('a' > x || x > 'z') && ('0' > x || x > '9') && ('A' > x || x > 'Z');
    }

    public boolean isPalindrome(String s) {
        int i = 0,j = s.length()-1,temp = 'a'-'A';
        char[] a = s.toCharArray();
        while(i < j){
            try{
                while(isInvalid(a[i])){
                    i++;
                }
                while (isInvalid(a[j])){
                    j--;
                }
            }catch (IndexOutOfBoundsException e){break;}
            if (i >= j) break;
            if (a[i] == a[j] || a[i]+temp == a[j] || a[i]-temp == a[j]){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
