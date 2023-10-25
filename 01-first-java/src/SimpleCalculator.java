import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter the Operation(+, -, *, /, %: ): ");
        String operator = sc.next();

        switch (operator) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> System.out.println(num1 / num2);
            case "%" -> System.out.println(num1 % num2);
            default -> System.out.println("Enter Valied Operator");
        }

    }
}
