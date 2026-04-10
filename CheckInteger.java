/*to check whether the number is integer or not  */
import java.util.Scanner;

class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num % 1 == 0)
            System.out.println(num + " is an Integer");
        else
            System.out.println(num + " is NOT an Integer");

        sc.close();
    }
}