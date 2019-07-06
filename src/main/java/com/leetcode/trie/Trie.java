package com.leetcode.trie;

import java.util.HashMap;

/**
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 *
 * 说明:
 * 你可以假设所有的输入都是由小写字母 a-z 构成的。
 * 保证所有输入均为非空字符串。
 * Created By Cx On 2019/3/25 17:54
 */
public class Trie {
    class Node{
        //用来保存儿子节点
        private HashMap<Character,Node> son;
        Node(){
            this.son = new HashMap<>();
        }
    }

    //父节点map
    private HashMap<Character,Node> parents;

    /** Initialize your data structure here. */
    public Trie() {
        parents = new HashMap<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node parent = parents.get(word.charAt(0));
        if (parent == null){
            Node node = new Node();
            int i = 1;
            while(i < word.length()){

            }
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

    }
}
