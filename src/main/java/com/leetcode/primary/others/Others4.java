package com.leetcode.primary.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * Created By Cx On 2019/1/27 16:58
 */
public class Others4 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows < 1) return ans;
        List<Integer> a = Collections.singletonList(1);
        ans.add(a);
        for (int i = 2; i <= numRows;i++){
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i; j++){
                if (j == 0){
                    temp.add(a.get(j));
                }else if (j == i-1){
                    temp.add(a.get(j-1));
                }else {
                    temp.add(a.get(j-1)+a.get(j));
                }
            }
            ans.add(temp);
            a = temp;
        }
        return ans;
    }
}
