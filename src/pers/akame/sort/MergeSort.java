package pers.akame.sort;

import java.util.Arrays;

/**归并排序采用的是常见的分治算法思想,用的也是常用的递归
 * 归并排序和选择排序一样时间复杂度不受数据影响,但是不管在那种情况下,归并排序都能达到O(nlogn)
 * 但是作为代价需要O(n)的空间
 * 在复制数组部分,代码还有很大优化空间,这里主要是描述归并过程因此不做优化*/

public class MergeSort extends Sort {
    public static void sort(int[] sequence){
        int[] newseq=mergeSort(sequence);
        for (int i = 0; i < newseq.length; i++) {
            sequence[i]=newseq[i];
        }
    }

    private static int[] mergeSort(int[] sequence){
        if(sequence.length<2)
            return sequence;
        int middle=sequence.length/2;
        int[] left= Arrays.copyOfRange(sequence,0,middle);
        int[] right=Arrays.copyOfRange(sequence,middle,sequence.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    private static int[] merge(int[] left,int[] right){
        //在这里用到了额外空间
        int[] result=new int[left.length+right.length];
        int leftIndex=0,rightIndex=0;
        while (leftIndex!=left.length||rightIndex!=right.length){
            if(leftIndex<left.length&&rightIndex<right.length){
                if(left[leftIndex]<=right[rightIndex]){
                    result[leftIndex+rightIndex]=left[leftIndex];
                    leftIndex++;
                }else {
                    result[leftIndex+rightIndex]=right[rightIndex];
                    rightIndex++;
                }
            }else if (leftIndex==left.length){
                result[leftIndex+rightIndex]=right[rightIndex];
                rightIndex++;
            }else {
                result[leftIndex+rightIndex]=left[leftIndex];
                leftIndex++;
            }
        }
        return result;
    }
}
