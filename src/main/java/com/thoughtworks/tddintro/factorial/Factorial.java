package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int i) {
        int result;
        if (i == 0 || i == 1){
            result = 1;
        }else if(i > 1){
            result = 1;
            while (i > 1){
                result = result *i;
                i--;
            }
        }else
            throw new IllegalArgumentException("Cannot take factorial of negative number.");

        return result;
    }
}
