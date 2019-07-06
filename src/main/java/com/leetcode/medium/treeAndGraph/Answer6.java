package com.leetcode.medium.treeAndGraph;

/**
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，
 * 并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 * 示例 1:
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 * 输出: 3
 * Created By Cx On 2019/3/15 11:12
 */
public class Answer6 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length < 1) return 0;
        int ans = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    ans++;
                    findAndChange(grid,i,j);
                }
            }
        }
        return ans;
    }

    private void findAndChange(char[][] grid, int i, int j) {
        if (0 > i || i >= grid.length || 0 > j || j >= grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = '2';
        //这四个递归的顺序无所谓
        findAndChange(grid,i,j+1);//向下
        findAndChange(grid,i+1,j);//向右
        findAndChange(grid,i,j-1);//向上
        findAndChange(grid,i-1,j);//向左
    }
}
