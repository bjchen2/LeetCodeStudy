package com.leetcode.primary.math;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * Created By Cx On 2019/1/27 15:30
 */
public class Math4 {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0;i < chars.length; i++){
            if (chars.length == i+1) {
                sum += getV(chars[i]);
            }
            else if (chars[i] == 'I' && chars[i+1] == 'V'){
                sum += 4;
                i++;
            }
            else if (chars[i] == 'I' && chars[i+1] == 'X'){
                sum += 9;
                i++;
            }
            else if (chars[i] == 'X' && chars[i+1] == 'L'){
                sum += 40;
                i++;
            }
            else if (chars[i] == 'X' && chars[i+1] == 'C'){
                sum += 90;
                i++;
            }
            else if (chars[i] == 'C' && chars[i+1] == 'D'){
                sum += 400;
                i++;
            }
            else if (chars[i] == 'C' && chars[i+1] == 'M'){
                sum += 900;
                i++;
            }
            else {
                sum += getV(chars[i]);
            }
        }
        return sum;
    }

    private int getV(char c){
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else if (c == 'M') return 1000;
        return -1;
    }

}
