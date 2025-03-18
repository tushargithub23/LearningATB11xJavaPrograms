package Practise_Task_programs;

import java.util.Scanner;

public class Max_Min_no
{
    int no1, no2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        // option1
        if(no1>no2)
        {
            System.out.println("Number 1 maximum");
        }
        else
        {
            System.out.println("Number 2 is maximum");
        }
        // option2 ternary oprator
        int max_value=(no1>no2)?no1:no2;
        System.out.println("Max number is "+max_value);
        sc.close();
        int min_value=(no1<no2)?no1:no2;
        System.out.println("Minimum value is"+min_value);
    }
}
