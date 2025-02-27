import java.util.Scanner;

// Abstract base class
abstract class Calculation {
    // Abstract method with two parameters
    public abstract double operation(double x, double y);
}

// Addition subclass
class Addition extends Calculation {
    @Override
    public double operation(double x, double y) {
        return x + y;
    }
}
 
// Subtraction subclass
class Subtraction extends Calculation {
    @Override
    public double operation(double x, double y) {
        return x - y;
    }
}

// Multiplication subclass
class Multiplication extends Calculation {
    @Override
    public double operation(double x, double y) {
        return x * y;
    }
}

// Division subclass
class Division extends Calculation {
    @Override
    public double operation(double x, double y) {
        return x / y;
    }
}

// Exponentiation subclass
class Exponentiation extends Calculation {
    @Override
    public double operation(double x, double y) {
        return Math.pow(x, y);
    }
}

// Calculator class that aggregates the operation classes
class Calculator {
    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;
    private Exponentiation exponentiation;

    // Constructor to instantiate each operation
    public Calculator() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
        exponentiation = new Exponentiation();
    }
    
    public double add(double a, double b) {
        return addition.operation(a, b);
    }
    
    public double subtract(double a, double b) {
        return subtraction.operation(a, b);
    }
    
    public double multiply(double a, double b) {
        return multiplication.operation(a, b);
    }
    
    public double divide(double a, double b) {
        return division.operation(a, b);
    }
    
    public double exponentiate(double a, double b) {
        return exponentiation.operation(a, b);
    }
}

// Main class must be public and match the filename (Main.java)
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Create a Calculator instance
        Calculator calc = new Calculator();
        
        // Ask the user for the type of operation
        System.out.println("Enter operation (+, -, *, /, ^ for exponentiation):");
        String operation = scanner.nextLine();
        
        // Ask the user for two numbers
        System.out.println("Enter the first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double b = scanner.nextDouble();
        
        double result = 0;
        boolean valid = true;
        
        // Perform the selected operation
        switch (operation) {
            case "+":
                result = calc.add(a, b);
                break;
            case "-":
                result = calc.subtract(a, b);
                break;
            case "*":
                result = calc.multiply(a, b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                } else {
                    result = calc.divide(a, b);
                }
                break;
            case "^":
                result = calc.exponentiate(a, b);
                break;
            default:
                System.out.println("Invalid operation entered.");
                valid = false;
                break;
        }
        
        // If the operation was valid, display the result
        if (valid) {
            System.out.println("Result: " + result);
        }
        
        // Close the scanner
        scanner.close();
    }
}
