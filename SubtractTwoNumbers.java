import java.util.Scanner;  //Scanner class allows for user input

public class SubtractTwoNumbers {

    public static void main(String[] args) {

    //Creating an instance of the scanner class 

    Scanner scanner = new Scanner(System.in);

    //Input first number
    System.out.println("Enter the first number: ");
    double num1 = scanner.nextDouble();

    //intput second number
    System.out.println("Enter the second number: ");
    double num2 = scanner.nextDouble();

    //Calculate the sum
    double sum = num1 - num2

    //Display the result
    System.out.println("The sum is:" + sum);

    //Close the scanner
    scanner.close()


    
    }  
}