package pers.akame.sort;

/**希尔排序使用的是变化的归并算法,对于每一次归并内部使用插入排序
 * 通过分解问题规模来降低算法的时间复杂度
 * 希尔排序的最优最差和平均复杂度都是O(nlog_2 n)
 * 希尔推荐的gap是每次除以2,实际应用中发现这种选择也确实有效,但这种选择并不是绝对的
 * 而如何选择最优的gap值则是一个比较难证明的数学问题,因此一般使用2*/

public class ShellSort extends Sort {
    public static void sort(int[] sequence){
        int len=sequence.length;
        int temp,gap=len/2;
        while (gap>0){
            for (int i = gap; i < len; i++) {
                temp=sequence[i];
                int preIndex=i-gap;
                while (preIndex>=0&&sequence[preIndex]>temp){
                    //由于前面都是已经排完序的,所以这里while条件不满足可以直接退出
                    //这里实际上用的插入排序
                    sequence[preIndex+gap]=sequence[preIndex];
                    preIndex-=gap;
                }
                sequence[preIndex+gap]=temp;
            }
            gap/=2;
        }
    }
}
