/* write a program for calculating cgpa using marks of three subjects (out of 100) */
import java.util.Scanner;

class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 3 subjects (out of 100): ");
        float c1 = sc.nextFloat();
        float c2 = sc.nextFloat();
        float c3 = sc.nextFloat();

        float cgpa_calculator = ((c1 + c2 + c3) / 300) * 9.6f;
        System.out.printf("CGPA is %.2f%n", cgpa_calculator);

        sc.close();
    }
}