package pers.akame.sort;

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
