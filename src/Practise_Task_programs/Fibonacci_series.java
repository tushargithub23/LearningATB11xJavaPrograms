package Practise_Task_programs;

import java.util.Scanner;

public class Fibonacci_series {
    // input take no from user
    // enter the fib no 3
    // 0 1 2
    //0+1+2
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the fib number");
        int no=sc.nextInt();

        int first = 0, second = 1, third = 0; // First two numbers

        for (int i = 2; i <= no; i++)
        {  // Start from 2 because 0 and 1 are fixed
            third = first + second;  // Add previous two numbers 1
            first = second;  // Move first forward 0
            second = third;  // Move second forward 1

        }
        System.out.println("fib sum of "+no+" = " + third); // Output: 5
    }
    }
