package Practise_Task_programs.Array;

import java.util.Scanner;

public class Test_Array_min_max {
    public static void main(String[] args) {
        //Take input array from user

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter the Marks of 5 Student"); // take the array input
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Your entered marks are"); // print the entered marks
        for (int i = 0; i < 5; i++) {
            System.out.println("Student" + (i + 1) + ":->" + +marks[i]);
        }
        //find the maximum marks from the given}
        System.out.println("Maximum Marks");
        int max = marks[0];
        for (int i = 0; i < 5; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Highest marks is :-" + max);
        //find the maximum marks from the given}
        System.out.println("Miniimum Marks are");
        int min = marks[0];
        for (int i = 0; i < 5; i++) {
            if (marks[i] < min) {
                max = marks[i];
            }
        }
        System.out.println(" Min marks is :-" + min);
    }

}

