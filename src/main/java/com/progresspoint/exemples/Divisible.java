package com.progresspoint.exemples;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class Divisible {

    public static boolean isDivisibleMy(long n, long x, long y) {
        if(n%x==0 && n%y==0) return true;

        return false;
    }

    public boolean isDivisible1(long n, long x, long y) {
        if(n%x==0 && n%y==0) return true;

        return false;
    }


    public boolean isDivisible2(long n, long... divisors) {
        return stream(divisors).allMatch(divisor -> n % divisor == 0);
    }


    public Boolean isDivisible3(long n, long x, long y) {
        return Arrays.asList(x, y).stream().allMatch(i -> n % i == 0);
    }


}
