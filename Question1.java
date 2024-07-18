//Write a Program to calculate percentage of a given student in CBSE board exam.
/// His mnarks form 5 subjects should be taken from the user
/// and percentage should be calculated and displayed on the screen.


import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects");
        System.out.print("Subject 1:");
        float sub1 = sc.nextFloat();
        System.out.print("Subject 2:");
        float sub2 = sc.nextFloat();
        System.out.print("Subject 3:");
        float sub3 = sc.nextFloat();
        System.out.print("Subject 4:");
        float sub4 = sc.nextFloat();
        System.out.print("Subject 5:");
        float sub5 = sc.nextFloat();
        float total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("the total is: " + total);
        float percentage = (total / 5)*100;
        System.out.println("The percentage is: " + percentage + "%");
        }
}
