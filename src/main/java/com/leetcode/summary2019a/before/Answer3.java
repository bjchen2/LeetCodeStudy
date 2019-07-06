package com.leetcode.summary2019a.before;

/**
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 *
 * Note：设当前位置为x，x下边比x大，x左边比x小，以此为依据查找，时间复杂度O(m+n)
 * @author Cx
 * @version jdk8 and idea On 2019/6/30 22:53
 */
public class Answer3 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return false;
        }
        int col = matrix[0].length,m = 0,n = 0;
        System.out.println(col + " " + row);
        try {
            while(matrix[m][n] != target){
                if (matrix[m][n] < target ) {
                    if (m < row - 1 && matrix[m+1][n] < target) {
                        m++;
                    }else {
                        return false;
                    }
                }
                else if (matrix[m][n] > target) {
                    if (n < col-1 && matrix[m][n+1] > target) {
                        n++;
                    }else {
                        return false;
                    }
                }
            }
            return true;
        }catch (Exception ignored){
        }
        return false;
    }
}
