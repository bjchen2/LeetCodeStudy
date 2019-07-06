package com.leetcode.medium.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * ["RandomizedSet","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","insert","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","getRandom","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove","remove"]
 * [[],[1000000000],[1000000001],[1000000002],[1000000003],[1000000004],[1000000005],[1000000006],[1000000007],[1000000008],[1000000009],[1000000010],[1000000011],[1000000012],[1000000013],[1000000014],[1000000015],[1000000016],[1000000017],[1000000018],[1000000019],[1000000020],[1000000021],[1000000022],[1000000023],[1000000024],[1000000025],[1000000026],[1000000027],[1000000028],[1000000029],[1000000030],[1000000031],[1000000032],[1000000033],[1000000034],[1000000035],[1000000036],[1000000037],[1000000038],[1000000039],[1000000040],[1000000041],[1000000042],[1000000043],[1000000044],[1000000045],[1000000046],[1000000047],[1000000048],[1000000049],[1000000050],[1000000051],[1000000052],[1000000053],[1000000054],[1000000055],[1000000056],[1000000057],[1000000058],[1000000059],[1000000060],[1000000061],[1000000062],[1000000063],[1000000064],[1000000065],[1000000066],[1000000067],[1000000068],[1000000069],[1000000070],[1000000071],[1000000072],[1000000073],[1000000074],[1000000075],[1000000076],[1000000077],[1000000078],[1000000079],[1000000080],[1000000081],[1000000082],[1000000083],[1000000084],[1000000085],[1000000086],[1000000087],[1000000088],[1000000089],[1000000090],[1000000091],[1000000092],[1000000093],[1000000094],[1000000095],[1000000096],[1000000097],[1000000098],[1000000099],[-1000000000],[-1000000001],[-1000000002],[-1000000003],[-1000000004],[-1000000005],[-1000000006],[-1000000007],[-1000000008],[-1000000009],[-1000000010],[-1000000011],[-1000000012],[-1000000013],[-1000000014],[-1000000015],[-1000000016],[-1000000017],[-1000000018],[-1000000019],[-1000000020],[-1000000021],[-1000000022],[-1000000023],[-1000000024],[-1000000025],[-1000000026],[-1000000027],[-1000000028],[-1000000029],[-1000000030],[-1000000031],[-1000000032],[-1000000033],[-1000000034],[-1000000035],[-1000000036],[-1000000037],[-1000000038],[-1000000039],[-1000000040],[-1000000041],[-1000000042],[-1000000043],[-1000000044],[-1000000045],[-1000000046],[-1000000047],[-1000000048],[-1000000049],[-1000000050],[-1000000051],[-1000000052],[-1000000053],[-1000000054],[-1000000055],[-1000000056],[-1000000057],[-1000000058],[-1000000059],[-1000000060],[-1000000061],[-1000000062],[-1000000063],[-1000000064],[-1000000065],[-1000000066],[-1000000067],[-1000000068],[-1000000069],[-1000000070],[-1000000071],[-1000000072],[-1000000073],[-1000000074],[-1000000075],[-1000000076],[-1000000077],[-1000000078],[-1000000079],[-1000000080],[-1000000081],[-1000000082],[-1000000083],[-1000000084],[-1000000085],[-1000000086],[-1000000087],[-1000000088],[-1000000089],[-1000000090],[-1000000091],[-1000000092],[-1000000093],[-1000000094],[-1000000095],[-1000000096],[-1000000097],[-1000000098],[-1000000099],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[1000000000],[1000000001],[1000000002],[1000000003],[1000000004],[1000000005],[1000000006],[1000000007],[1000000008],[1000000009],[1000000010],[1000000011],[1000000012],[1000000013],[1000000014],[1000000015],[1000000016],[1000000017],[1000000018],[1000000019],[1000000020],[1000000021],[1000000022],[1000000023],[1000000024],[1000000025],[1000000026],[1000000027],[1000000028],[1000000029],[1000000030],[1000000031],[1000000032],[1000000033],[1000000034],[1000000035],[1000000036],[1000000037],[1000000038],[1000000039],[1000000040],[1000000041],[1000000042],[1000000043],[1000000044],[1000000045],[1000000046],[1000000047],[1000000048],[1000000049],[1000000050],[1000000051],[1000000052],[1000000053],[1000000054],[1000000055],[1000000056],[1000000057],[1000000058],[1000000059],[1000000060],[1000000061],[1000000062],[1000000063],[1000000064],[1000000065],[1000000066],[1000000067],[1000000068],[1000000069],[1000000070],[1000000071],[1000000072],[1000000073],[1000000074],[1000000075],[1000000076],[1000000077],[1000000078],[1000000079],[1000000080],[1000000081],[1000000082],[1000000083],[1000000084],[1000000085],[1000000086],[1000000087],[1000000088],[1000000089],[1000000090],[1000000091],[1000000092],[1000000093],[1000000094],[1000000095],[1000000096],[1000000097],[1000000098],[1000000099],[-1000000000],[-1000000001],[-1000000002],[-1000000003],[-1000000004],[-1000000005],[-1000000006],[-1000000007],[-1000000008],[-1000000009],[-1000000010],[-1000000011],[-1000000012],[-1000000013],[-1000000014],[-1000000015],[-1000000016],[-1000000017],[-1000000018],[-1000000019],[-1000000020],[-1000000021],[-1000000022],[-1000000023],[-1000000024],[-1000000025],[-1000000026],[-1000000027],[-1000000028],[-1000000029],[-1000000030],[-1000000031],[-1000000032],[-1000000033],[-1000000034],[-1000000035],[-1000000036],[-1000000037],[-1000000038],[-1000000039],[-1000000040],[-1000000041],[-1000000042],[-1000000043],[-1000000044],[-1000000045],[-1000000046],[-1000000047],[-1000000048],[-1000000049],[-1000000050],[-1000000051],[-1000000052],[-1000000053],[-1000000054],[-1000000055],[-1000000056],[-1000000057],[-1000000058],[-1000000059],[-1000000060],[-1000000061],[-1000000062],[-1000000063],[-1000000064],[-1000000065],[-1000000066],[-1000000067],[-1000000068],[-1000000069],[-1000000070],[-1000000071],[-1000000072],[-1000000073],[-1000000074],[-1000000075],[-1000000076],[-1000000077],[-1000000078],[-1000000079],[-1000000080],[-1000000081],[-1000000082],[-1000000083],[-1000000084],[-1000000085],[-1000000086],[-1000000087],[-1000000088],[-1000000089],[-1000000090],[-1000000091],[-1000000092],[-1000000093],[-1000000094],[-1000000095],[-1000000096],[-1000000097],[-1000000098],[-1000000099]]
 *
 *
 * todo 类似实现一个hashMap
 * 设计一个支持在平均 时间复杂度 O(1) 下，执行以下操作的数据结构。
 * insert(val)：当元素 val 不存在时，向集合中插入该项。
 * remove(val)：元素 val 存在时，从集合中移除该项。
 * getRandom：随机返回现有集合中的一项。每个元素应该有相同的概率被返回。
 * 操作元素均为int
 * Created By Cx On 2019/3/24 18:50
 */
public class Answer2 {
    static class RandomizedSet {
        private List<Integer> list = new ArrayList<>();
        private Node[] table;
        //当前数据量
        private int count;
        //负载因子
        final float LOAD_FACTORY = 0.75f;
        //最大容量
        private int maxSize;

        class Node{
            int v;
            //idx为该数在链表中的位置
            int idx;
            Node next;
            Node(int v,int idx,Node next){
                this.v = v;
                this.idx = idx;
                this.next = next;
            }
        }
        /** Initialize your data structure here. */
        public RandomizedSet() {
            table = new Node[16];
            maxSize = (int) (table.length * LOAD_FACTORY);
        }

        //扩容两倍
        private void resize() {
            Node[] newTab = new Node[table.length*2];
            maxSize *= 2;
            rehash(newTab);
            table = newTab;
        }

        private void rehash(Node[] newTab) {
            Node e;
            for (int i = 0; i < table.length;i++){
                if ((e = table[i]) != null){
                    //原来的指针抛弃
                    table[i] = null;
                    //双指针防止1.7中的死循环
                    Node oldHead = null,newHead = null,oldTail = null,newTail = null;
                    while(e != null){
                        if ((e.v & table.length) == 0){
                            //如果位置不变
                            if (oldTail == null) oldHead = e;
                            else oldTail.next = e;
                            oldTail = e;
                        }else {
                            if (newTail == null) newHead = e;
                            else newTail.next = e;
                            newTail = e;
                        }
                        e = e.next;
                    }
                    if (oldTail != null) oldTail.next = null;
                    else newTail.next = null;
                    newTab[i] = oldHead;
                    newTab[table.length + i] = newHead;
                }
            }
        }

        private boolean insertNode(int h, Node node){
            Node head = table[h],t = null;
            while(head != null){
                if (head.v == node.v) return false;
                t = head;
                head = head.next;
            }
            //这里不可能为空，因为只有table[h]不为空时才会调用该方法
            t.next = node;
            return true;
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            int h = (table.length-1) & val;
            Node node = new Node(val,count,null);
            if (table[h] == null) table[h] = node;
            else if (!insertNode(h,node)) return false;
            if (++count > maxSize) resize();
            list.add(val);
            return true;
        }

        private boolean removeNode(Node node, int val) {
            Node t = node,t2;
            while((t2 = t.next) != null){
                if (t2.v == val) {
                    t.next = t2.next;
                    list.set(t2.idx, list.get(--count));
                    list.remove(count);
                    return true;
                }
                t = t.next;
            }
            return false;
        }

        private Node getNode(int val){
            Node head = table[val & (table.length-1)];
            while (head != null){
                if (head.v == val) return head;
                head = head.next;
            }
            return null;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            int h = (table.length-1) & val;
            Node e;
            if ((e = table[h]) != null) {
                if (e.v == val) {
                    table[h] = table[h].next;
                    //先将待删除的数和最后一个数交换，保证删除是O(1)的
                    list.set(e.idx, list.get(--count));
                    Node t;
                    if ((t = getNode(list.get(count))) != null) {
                        t.idx = e.idx;
                    }
                    list.remove(count);
                    return true;
                }
                else return removeNode(table[h],val);
            }
            return false;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            Random random = new Random();
            return list.get(random.nextInt(list.size()));
        }
    }

    public static void main(String[] args) {
        RandomizedSet r = new RandomizedSet();
//        System.out.println(-8&15);
//        System.out.println(r.remove(0));
//        System.out.println(r.insert(6));
//        System.out.println(r.insert(-8));
//        System.out.println(r.getRandom());
//        System.out.println(r.remove(0));
//        System.out.println(r.insert(0));

    }
}
