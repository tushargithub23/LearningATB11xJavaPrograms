package Practise_Task_programs;

import java.util.Scanner;

public class Grade_Calcualtor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks ");
        float grade = sc.nextFloat();
        if (grade >= 90 && grade <= 100) {
            System.out.println("\uD83C\uDF89\uD83C\uDF8A Congratulations! \uD83C\uDF8A\uD83C\uDF89 You recieved A Grade  !!");

        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Congratulations You recieved B Grade");

        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Congratulations You recieved C Grade");

        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Congratulations You recieved E Grade");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("You Grade is F Needs more improvements ");
        } else
            System.out.println("Entered Grades is not Valid ");
    }
}
