package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String s = "hello";


        System.out.println(reversString(s));

        System.out.println(isPalindrome(s));

        String s2 = "helleh";

        System.out.println(reversString(s2));

        System.out.println(isPalindrome(s2));



        printPrimeNumbers(10);

    }





    static String reversString (String string) {
        return new StringBuilder(string).reverse().toString();
    }


    static boolean isPalindrome (String string){
       return (reversString(string).equals(string));
    }


    static void printPrimeNumbers(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        for (int i = 3; i < n; i+=2) { // skip over even numbers since they are not prime
            boolean isPrime = true;
            for (Integer prime : primeNumbers) { // check current prime numbers to see if it evenly divides into number
                if (i % prime == 0) { // when number is not prime
                    isPrime = false;
                    break; // optimization: stop checking when number is already not prime
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }


}