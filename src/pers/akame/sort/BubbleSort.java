package pers.akame.sort;

public class BubbleSort extends Sort{
    public BubbleSort(){

    }

    public static void bubbleSort(int[] sequence) {
        for (int i = sequence.length - 1; i >= 0; i--)
            for (int j = 0; j < i; j++)
                if (sequence[j] > sequence[j + 1])
                    swap(sequence, j, j + 1);
    }
}
