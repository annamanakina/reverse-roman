package com.example.training.task.roman;

public class ReverseRomanMain {
    public static void main(String[] args) {
        ReverseRomanTask task = new ReverseRomanTask();
        //"MCMXC" -1990
        //MMMCCCIII - 3303
        //MMMCCCXII 3312
        // MLVII 1057
        //DXCIII 593
        System.out.println(task.convertRomanToArabic("MMMCCCIII"));

    }
}
