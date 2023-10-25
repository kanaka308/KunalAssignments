import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check even or odd: ");
        int num = sc.nextInt();
        evenOdd(num);

    }
    static void evenOdd(int num){
        if (num%2==0){
            System.out.println("The Number is EVEN");
        }else {
            System.out.println("The Number is ODD");
        }
        }

    }

