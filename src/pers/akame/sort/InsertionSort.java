package pers.akame.sort;

/**最好情况下时间复杂度和冒泡排序一样是O(n),但平均情况和最坏情况下也都是O(n²)
 * 所需额外空间为O(1)
 * 算法思路简单,但性能并不算良好,并且个人感觉时间复杂度为O(n²)的几个算法中还是冒泡排序最简洁*/

public class InsertionSort extends Sort {
    public static void sort(int[] sequence){
        int sortedIndex=0;
        for (int i = sortedIndex+1; i < sequence.length; i++) {
            int currentEle=sequence[i];
            for (int j = 0; j < i; j++) {
                if(currentEle<sequence[j]){
                    //应该把currentEle插入到j的位置,从j开始所有到i位置的元素往后移动一格
                    for (int k = i-1; k >=j; k--) {
                        sequence[k+1]=sequence[k];
                    }
                    sequence[j]=currentEle;
                    break;
                }
            }
        }
    }
}
