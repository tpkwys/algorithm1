package com.aaron.algorithm.alg_sort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****八大排序算法*****");
        int array[]=new int[10];
        Sort sort=new Sort();
        initArray(array);
        System.out.println("排序前:");
        print(array);
        sort.bubbleSort(array,true);
        System.out.println("冒泡排序后:");
        print(array);

        initArray(array);
        System.out.println("排序前:");
        print(array);
        sort.insertSort(array);
        System.out.println("插入排序后:");
        print(array);

        initArray(array);
        System.out.println("排序前:");
        print(array);
        sort.shellSort(array);
        System.out.println("希尔排序后:");
        print(array);

        initArray(array);
        System.out.println("排序前:");
        print(array);
        sort.selectSort(array);
        System.out.println("选择排序后:");
        print(array);
    }
    private static void print(int[]array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    private static void initArray(int[]array){
        Random random=new Random(49);
       for(int i=0;i<array.length;i++){
           array[i]=random.nextInt(100);
       }
    }
}
