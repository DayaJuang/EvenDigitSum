package org.example;

public class Main {
    public static void main(String[] args) {
        int ans = getEvenDigitSum(123456789);
        System.out.println(ans);
    }

    public static int getEvenDigitSum(int n){
        // Check if n is positive or not
        if(n < 0)
            return -1;

        // Calculate the sum of even number
        int sum = 0;
        int digit;

        while(n > 0){
            digit = n % 10; // take the digit of n

            //Check if the digit is even number or not
            if(digit % 2 == 0){
                // sum the number
                sum += digit;
            }
            n /= 10; // Reduce the digit number of n
        }

        return sum;
    }
}