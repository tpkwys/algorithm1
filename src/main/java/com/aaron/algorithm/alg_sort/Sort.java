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

    /**
     * 直接插入排序：把新的数据插入到已经排好的数据列中。将第一个数和第二个数排序
     * 然后构成一个有序序列，将第三个数插入进去，构成一个新的有序序列。对于第四个
     * 第五个以此如此。
     * @param array
     */
    public void insertSort(int[]array){
        int len= array.length;
        if(len<=1) return;
        int insertNum;//要插入的数
        for(int i=1;i<len;i++){
            //因为第一个数不用插入，所以从1开始
            insertNum=array[i];
            int j=i-1;//已排好序的最后一个元素索引
            while(j>=0&&array[j]>insertNum){
                array[j+1]=array[j];//元素后移
                j--;
            }
            array[j+1]=insertNum;//找到适当位置，插入当前元素
        }
    }

    /**
     * 希尔排序：是插入排序的一种更高效的改进版本（非稳定排序算法），插入排序一般来说是
     * 低效率的，因为插入排序每次只能将数据移动一位。
     * 1.将数组长度设为n,取奇数k=n/2,将下表值为k的数分为一组，构成有序序列。
     * 2.再去k/=2,将下表差值为k的数分为一组，构成有序序列。
     * 3.重复第二步，直到K=1,执行简单插入排序。
     * @param array
     */
    public void shellSort(int array[]){
        //1.确定分组的组数
        //2.然后对组中元素进行插入排序
        //3.然后将length/2,重复 1，2直到length=0
        int len=array.length;//把数组长度单独领出来提高效率
        while(len!=0){
            len/=2;
            for(int i=0;i<len;i++){
                //分组+插入排序
                for(int j=i+len;j<array.length;j+=len){
                    int k=j-len;//k为有序序列的最有一位的位数
                    int temp=array[j];//要插入的元素
                    //从后往前遍历
                    while(k>=0&&temp<array[k]){
                        array[k+len]=array[k];
                        k-=len;
                    }
                    array[k+len]=temp;
                }

            }
        }

    }
    public void selectSort(int []array){
        int len= array.length;
        for(int i=0;i<len;i++){
            int value=array[i];
            int position=i;
            for(int j=i+1;j<len;j++){
                //找出最下的值和位置
                if(array[j]<value){
                    value=array[j];
                    position=j;
                }
            }
            array[position]=array[i];
            array[i]=value;
        }
    }
}
