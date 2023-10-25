import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the beginning form where you want the Armstrong Number: ");
        int begin = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();
        for(int i = begin; i < end; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }


    }
    static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0){
            int last = num % 10;
            sum = sum + last*last*last;
            num = num / 10;
        }
        return temp == sum;
    }
}
