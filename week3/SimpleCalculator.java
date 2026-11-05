import java.util.Scanner;
 
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
 
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = input.next().charAt(0);
 
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
 
        double result;
        switch (op) {
            case '+':
                result = b + c;
                break;
            case '-':
                result = b - c;
                break;
            case '*':
                result = b * c;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: division by zero is not allowed.");
                    input.close();
                    return;
                }
                result = b / c;
                break;
            default:
                System.out.println("Error: invalid operator '" + op + "'.");
                input.close();
                return;
        }
 
        System.out.println(b + " " + op + " " + c + " = " + result);
        input.close();
    }
}
