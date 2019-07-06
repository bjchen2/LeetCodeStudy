package com.leetcode.medium.arrayAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * Created By Cx On 2019/1/30 11:38
 */
public class Answer1 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int r = nums.length-1;
        for(int i = 0; i < nums.length-2 && nums[i]<=0; i++){
            if(i>0&&nums[i]== nums[i-1] )continue;
            int j = i+1;
            while (r > j && nums[i] + nums[j] + nums[r] > 0){
                //最小值加上右边界仍大于0，则右边界过大，缩小右边界
                r--;
            }
            if (r < j){
                break;
            }
            int k = r;
            while(j < k){
                if (nums[i] + nums[j] + nums[k] < 0 ) {
                    j++;
                } else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }else {
                    result.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Answer1 a = new Answer1();
        System.out.println(a.threeSum(new int[]{1,0,-4}));;
    }
}
