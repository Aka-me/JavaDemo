package pers.akame;

import pers.akame.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] sequence={1,5,78,2,4,5,99,12,4,0,58,3245,24,15,0};
        ShellSort.sort(sequence);

        for (int element:
             sequence) {
            System.out.print(element+",");
        }
    }
}
