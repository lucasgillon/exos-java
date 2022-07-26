package com.hetfield.exosjava;

import java.util.Arrays;

public class Exercice {
    public static int persistence(long n) {
        if (n < 10) return 0;

        final long newN = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::valueOf)
                .reduce(1, (acc, next) -> acc * next);

        return persistence(newN) + 1;
    }

    public static void main(String[] args) {
        System.out.println(persistence(4));
    }
}

