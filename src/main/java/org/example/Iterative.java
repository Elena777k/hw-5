package org.example;

public class Iterative {


    public static int iterativeMethod(int n) {
        if (n <= 1) {
            return n;
        }

        int fibPrev = 0;
        int fibCurrent = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = fibCurrent;
            fibCurrent = fibPrev + fibCurrent;
            fibPrev = tmp;
        }

        return fibCurrent;
    }

    public static void main(String[] args) {
        System.out.println(iterativeMethod(7));
    }
}
//Просторова складність: O(1)
//Часова складність: O(n)