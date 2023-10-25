import java.util.Scanner;

public class RupeestoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in RUPEES: ");
        float rupees = sc.nextFloat();
        float usd = rupees / 80;
        System.out.println("The USD value is: $" + usd);
    }
}
