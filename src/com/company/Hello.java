package com.company;


import java.util.Random;

public class Hello {

    public static void main(String[] args) {
        Random random = new Random();
        String resultLine = "";

        int M = Integer.parseInt(args[0]);// Lines
        int N = Integer.parseInt(args[1]);// Columns


        boolean[][] t = new boolean[M][N];
        t[0][0] = true;


        for (int i = 0; i < M; i++) {

            for (int c = 0; c < N; c++) {

                t[i][c] = random.nextBoolean();

            }

        }


        for (int i = 0; i < M; i++) {

            for (int c = 0; c < N; c++) {
                if (t[i][c]) {
                    resultLine = resultLine + " * ";
                } else {
                    resultLine = resultLine + " % ";
                }

            }
            System.out.println(resultLine);
            resultLine = "";

        }


    }

}
