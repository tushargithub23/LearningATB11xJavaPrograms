package Practise_Task_programs;

import java.util.Scanner;

public class Task_14_march_traingle_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Sides length of triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.print("You Have Entered:- " + side1 + " ," + side2 + " ," + side3);
        if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println();
            System.out.println("All 3 sides are equal means this is equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println();
            System.out.println("Its Isoscales traingle means two side are equal ");
        } else {
            System.out.println();
            System.out.println("None of the side are equal This is a Scalene Triangle");
        }
        sc.close();
    }
}
