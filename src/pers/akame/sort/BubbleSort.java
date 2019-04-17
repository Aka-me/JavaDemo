package pers.akame.sort;

/**冒泡排序,实现简单,但是时间复杂度较高
 * 最优情况O(n),但是平均和最差都达到了O(n²)
 * 冒泡排序是一种稳定的排序*/

public class BubbleSort extends Sort{
    public BubbleSort(){
        super();
    }

    public static void sort(int[] sequence) {
        for (int i = sequence.length - 1; i >= 0; i--)
            for (int j = 0; j < i; j++)
                if (sequence[j] > sequence[j + 1])
                    swap(sequence, j, j + 1);
    }
}
