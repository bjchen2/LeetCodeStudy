package com.leetcode.medium.sortAndSearch;

import java.util.*;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 2:
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * Created By Cx On 2019/3/21 20:50
 */
public class Answer6 {

    public List<Interval> ans(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        if (intervals.size() <= 0) {
            return result;
        }
        intervals.sort(Comparator.comparingInt(o -> o.start));
        //这里用一个临时变量存储合并的interval
        Interval temp = intervals.get(0);
        for (int i = 1; i < intervals.size(); ++i) {
            if (intervals.get(i).start <= temp.end) {
                temp = new Interval(temp.start, Math.max(temp.end,intervals.get(i).end));
            } else {
                result.add(temp);
                temp = intervals.get(i);
            }
        }
        result.add(temp);
        return result;
    }

    public List<Interval> merge(List<Interval> intervals) {
        int len;
        if ((len=intervals.size()) == 0) return intervals;
        List<Interval> ans = new ArrayList<>();
        //耗时101ms(如果只是运行一次的，lambda表达式遍历比普通遍历慢5倍，因为lambda在第一次运行时会创建匿名内部类，该过程是运行期完成的)
        Collections.sort(intervals, Comparator.comparingInt(o -> o.start));
        //耗时20ms
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        Interval interval = intervals.get(0),temp;
        for (int i = 1;i < len;i++){
            temp = intervals.get(i);
            if (temp.start <= interval.end) interval.end = Math.max(interval.end,temp.end);
            else{
                ans.add(interval);
                interval = temp;
            }
        }
        ans.add(interval);
        return ans;
    }
}
