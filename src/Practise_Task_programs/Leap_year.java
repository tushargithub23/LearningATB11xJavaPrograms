package Practise_Task_programs;

import java.util.Scanner;

public class Leap_year
{
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("its leap year");
        } else {
            System.out.println("Its not leap year");
        }

        }
    }
