package pers.akame.sort;


/**选择排序在任何情况下时间复杂度都为O(n²)
 * 需要注意的是一般情况下选择排序是一种不稳定的排序,相等元素之间的前后关系可能被打乱
 * 这种不稳定性是由于选择出来的最小元素和当前未排序部分首位元素对换导致的
 * 如果想要获得稳定排序的结果,可以将$交换$变为$整体向后移动$,但作为代价,要么浪费时间在整体移动上,要么开辟新的区域存放排序后的结果
 * 总之,选择排序在性能上比不上冒泡排序,唯一的优点应该就只是好理解了吧╮(╯▽╰)╭
 * */
public class SelectionSort extends Sort {
    public SelectionSort() {
    }

    public static void sort(int[] sequence){
        for (int i = 0; i < sequence.length-1; i++) {
            int minIndex=i;
            for (int j = i; j < sequence.length; j++) {
                if(sequence[j]<sequence[minIndex])
                    minIndex=j;
            }
            swap(sequence,minIndex,i);
        }
    }
}
