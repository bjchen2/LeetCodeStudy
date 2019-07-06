package com.leetcode.medium.arrayAndString;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * todo 马拉车算法—O(2n+1)->O(n)
 * Created By Cx On 2019/1/31 13:48
 */
public class Answer5 {
    //===========================答案 13ms(非常暴力，不是马拉车，可能数据太水)=================================
    public String ans(String s) {
        int length = s.length();
        if (length == 0) {
            return "";
        }
        int begin = 0, end = 0;
        for (int i = 0; i < length; i++) {
            //假设中心轴为i时，回文串的长度
            int len1 = getLen(s, i, i);
            //假设中心轴为i、i+1时，回文串的长度
            int len2 = getLen(s,i , i + 1);
            int len = Math.max(len1, len2);
            if (len > end - begin) {
                begin = i - (len - 1) / 2;
                end = i + (len / 2);
            }
        }
        return s.substring(begin, end + 1);
    }

    //获取以i,j为中心轴的回文串长度
    private int getLen(String s, int i, int j) {
        int left = i, right = j;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    //===========================我的 36ms=================================
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder(s);
        //进行字符串预处理，保证字符串恒为奇数，且对称性不受影响
        int offset = 3 , length = s.length();
        sb.insert(0,"$#");
        for (int i = 0 ; i < length ; i++){
            sb.insert(offset,'#');
            offset += 2;
        }
        sb.append('@');
        //开始匹配，mx为最右回文串的右标，mid为最大回文串的对称下标
        int mid = 2,mx = 2;
        char[] temp = sb.toString().toCharArray();
        //记录所有元素的回文长度
        int[] p = new int[sb.toString().length()];
        //记录最大回文串下标和长度
        int maxIndex = 0, maxLength = 0;
        for (int i = 2; i < temp.length - 2; i++){
            p[i]++;
            if (i < mx){
                //如果下标在最右回文串内，取对称点的回文长度，若长度超过回文串右标，则取边界差
                p[i] = Math.min(p[2 * mid - i],mx - i);
            }
            while (temp[i + p[i]] == temp[i - p[i]]){
                p[i]++;
            }
            if (mx < i + p[i] - 1){
                mx = i + p[i] - 1;
                mid = i;
            }
            if (p[i] > maxLength){
                maxLength = p[i];
                maxIndex = i - p[i] + 1;
            }
        }
        String ans = sb.substring(maxIndex,maxIndex + 2 * maxLength - 1);
        return ans.replace("#","");
    }

    public static void main(String[] args) {
        String s = "cbbd";
    }
}
