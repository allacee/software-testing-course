package main;

import java.io.IOException;

public class Task1 {
    private static final int n = 1000;

    public static double expanse(double x) throws IllegalArgumentException {

        if (Math.abs(x) > 1)
            throw new IllegalArgumentException("abs(x) is greater than 1");

        double result = 0;

        for (int i = 0; i <= n; i++)
            result += (Math.pow(-1, i) * Math.pow(x, (2*i + 1))) / (2*i + 1);


        return result;
    }
}