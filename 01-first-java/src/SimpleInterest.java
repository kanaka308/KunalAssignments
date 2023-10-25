import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        int p = sc.nextInt();
        System.out.print("Enter Time in years: ");
        float t = sc.nextFloat();
        System.out.print("Enter Interest Rate in percentage: ");
        float r = sc.nextFloat();

        float simple_interest = p*t*r/100;
        System.out.println("The Simple Interest for your input is "+simple_interest);
    }
}
