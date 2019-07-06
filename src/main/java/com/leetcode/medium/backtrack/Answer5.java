package com.leetcode.medium.backtrack;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 * 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 示例:
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * 给定 word = "ABCCED", 返回 true.
 * 给定 word = "SEE", 返回 true.
 * 给定 word = "ABE", 返回 false.
 * Created By Cx On 2019/3/18 21:30
 */
public class Answer5 {

    private boolean ans;
    private char[][] a;
    private String s;

    public boolean exist(char[][] board, String word) {
        if (board.length < 1) return ans;
        a = board;
        s = word;
        for(int i = 0; i < a.length;i++){
            for (int j = 0;j < a[0].length;j++){
                dfs(i,j,0);
                if (ans) return true;
            }
        }
        return false;
    }

    private void dfs(int i,int j,int idx){
        char c;
        if (ans || a[i][j] == '#' || (c = s.charAt(idx)) != a[i][j]) return;
        else idx++;
        if (idx == s.length()) ans = true;
        a[i][j] = '#';
        if (i > 0) dfs(i-1,j,idx); //向上
        if (j > 0) dfs(i,j-1,idx); //向左
        if (i < a.length-1) dfs(i+1,j,idx); //向下
        if (j < a[0].length - 1) dfs(i,j+1,idx); //向右
        a[i][j] = c;
    }

    public static void main(String[] args) {
        Answer5 a = new Answer5();
        System.out.println(a.exist(new char[][]{
                {'A','A'},
        },"AAA"));
    }
}
