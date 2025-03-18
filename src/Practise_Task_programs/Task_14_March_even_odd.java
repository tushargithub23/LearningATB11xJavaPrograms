package Practise_Task_programs;

import java.util.Scanner;

public class Task_14_March_even_odd {
    //take user input & Check weather the input is even or odd number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int no = sc.nextInt();
        if (no % 2 == 0) {
            System.out.println(" Entered Number is even");
        } else {
            System.out.println("Entered Number is odd");
        }
    }
}