/*
 * File: Problem5.java
 * ----------------------
 * Finds the smallest positive number evenly divisible
 * by all numbers from MIN to MAX.
 *
 * Shoutout to @elevenchars for reminding me that the problem 
 * was looking for the LCM
 * 
 * HackerRank link:
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler005/problem
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(LCM(n));
        }
    }

    // Least Common Multiple
    public static long LCM(long n) {
        long answer = 1;

        for (long i = 1; i <= n; i++) {
            answer *= i / GCD(i, answer);
        }

        return answer;
    }
    
    // Greatest Common Divisor
    public static long GCD(long a, long b) {
        while (b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}
