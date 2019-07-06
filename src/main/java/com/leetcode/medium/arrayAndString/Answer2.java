package com.leetcode.medium.arrayAndString;

import java.util.Arrays;

/**
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 * 示例 2:
 *
 * 输入:
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * 输出:
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 * 进阶:
 * 你能想出一个常数空间的解决方案吗？
 * Created By Cx On 2019/1/30 19:47
 */
public class Answer2 {

    //===============================答案===========================================
    public void ans(int[][] matrix) {
        boolean isFirstColHasZero = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i = 0; i < R; i++) {
            if(matrix[i][0] == 0) isFirstColHasZero = true;
            for(int j = 1; j < C; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = R - 1; i >= 0; i--) {
            for(int j = C - 1; j >= 1; j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if(isFirstColHasZero) {
                matrix[i][0] = 0;
            }
        }
    }


    //=========================我的==================================
    public static void setZeroes(int[][] matrix) {
        int[] flag = new int[2];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 0){
                    if (i == 0 && j == 0){
                        flag[0]++;
                        flag[1]++;
                    }
                    else if (j == 0){
                        flag[0]++;
                    }
                    else if (i == 0){
                        flag[1]++;
                    }
                    else {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        for (int i = 1; i < matrix.length; i++){
            if (matrix[i][0] == 0){
                for (int j = 1;j < matrix[i].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix[0].length; i++){
            if (matrix[0][i] == 0){
                for (int j = 1;j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        if (flag[0] != 0){
            for (int j = 0;j < matrix.length; j++){
                matrix[j][0] = 0;
            }
        }
        if (flag[1] != 0){
            for (int j = 0;j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}
