package part1;

import java.util.Scanner;

public class HelloTester {
    public static void main(String[] args) {
        //1.Inicialized what we know
        int assignmentTotal = 40;
        int examTotal = 200;
        int examGrade, assignmentGrade;

        //2. Get input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your total assignments grade: ");
        assignmentGrade = input.nextInt();

        System.out.println("Please enter your Exam grade: ");
        examGrade = input.nextInt();

        //3. Do some processing
        int studentGrade = assignmentGrade + examGrade;
        int total = assignmentTotal + examTotal;
        float percentage = (float) studentGrade/total * 100;

        //4. Print output
        System.out.println("Your Total Grade is: " + studentGrade);
        System.out.println("Your percentage is: " + percentage);
    }
}
