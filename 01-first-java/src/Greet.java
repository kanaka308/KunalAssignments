import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name Please: ");
        String name = sc.next();
        System.out.println("Hello " + name + " Good Morning!");
    }

}
