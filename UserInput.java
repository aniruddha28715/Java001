import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        //write your code here
        System.out.println("Taking Input form the User");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = a + b;
        System.out.println("The sum of the two numbers is: " + c);

        String str = sc.nextLine();
        System.out.println("The string is: " + str);
        


    }
}
