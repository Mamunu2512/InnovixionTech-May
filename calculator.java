package calculatorc;
import java.util.Scanner;
public class calculator {
	
 

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Choose operation: add, sub, mul, div, or type 'exit' to quit:");
	            String operation = scanner.nextLine();

	            if (operation.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting the calculator. Goodbye!");
	                break;
	            }

	            System.out.println("Enter first number:");
	            double num1 = scanner.nextDouble();
	            System.out.println("Enter second number:");
	            double num2 = scanner.nextDouble();

	            // Clear the newline left-over
	            scanner.nextLine();

	            switch (operation.toLowerCase()) {
	                case "add":
	                    System.out.println("Result: " + add(num1, num2));
	                    break;
	                case "sub":
	                    System.out.println("Result: " + subtract(num1, num2));
	                    break;
	                case "mul":
	                    System.out.println("Result: " + multiply(num1, num2));
	                    break;
	                case "div":
	                    if (num2 != 0) {
	                        System.out.println("Result: " + divide(num1, num2));
	                    } else {
	                        System.out.println("Error: Division by zero is not allowed.");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid operation. Please try again.");
	            }
	        }

	        scanner.close();
	    }

	    public static double add(double a, double b) {
	        return a + b;
	    }

	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    public static double divide(double a, double b) {
	        return a / b;
	    }
	}


