import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
       /* Write a program that takes five user input numbers
       stores them in an array, squares the numbers,
       stores the squared numbers in an array
        print numbers in an table */
 
        Scanner scanner1 = new Scanner(System.in);
 
        System.out.print("enter first number: ");
        double number1 = scanner1.nextDouble();
        System.out.print("enter second number: ");
        double number2 = scanner1.nextDouble();
        System.out.print("enter third number: ");
        double number3 = scanner1.nextDouble();
        System.out.print("enter fourth number: ");
        double number4 = scanner1.nextDouble();
        System.out.print("enter final number: ");
        double number5 = scanner1.nextDouble();
 
        Double[] numbers = {number1, number2, number3, number4, number5};
 
 
        double number1Sqrt = Math.sqrt(number1);
        double number2Sqrt = Math.sqrt(number2);
        double number3Sqrt = Math.sqrt(number3);
        double number4Sqrt = Math.sqrt(number4);
        double number5Sqrt = Math.sqrt(number5);
 
        Double[] numbersSqrt = {number1Sqrt,number2Sqrt,  number3Sqrt, number4Sqrt, number5Sqrt};
 
        //I'm not sure how to make a table. I'll update the code when I learn more.
 
    }
}
