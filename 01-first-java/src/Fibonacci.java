import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want the fibonacci series: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        while (b < num){
            System.out.println(b);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
