package com.aaron.algorithm.alg_sort;

public class Sort {

    /**
     * 冒泡排序：在要排序的一组数组中，对当前还未排序的全部数，从前到后对相邻的
     * 两个数一次进行比较和调整，让比较大的数往下沉，比较小的往上冒。
     * @param array
     */
    public void bubbleSort(int []array,boolean isAsc){
        if(array.length<=0) return;
        for(int i=0;i<array.length-1;i++){
            int temp=0;
            for(int j=0;j<array.length-i-1;j++){
                if(isAsc){
                    //递增序列
                    if(array[j]>array[j+1]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }else{
                    //递减序列
                    if(array[j]<array[j+1]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }

    }
}
