package org.example;

public class Recursive {
    public static int recursiveMethod(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveMethod(n - 1) + recursiveMethod(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(recursiveMethod(7));
    }
}
//Просторова складність: O(n)
//Часова складність: O(2^n)
