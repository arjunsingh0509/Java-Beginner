/* encrypting a grade by adding 8 to it and then decrypting it
   while showing the correct grade */
import java.util.Scanner;

class encrypting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade (0-100): ");
        int grade = sc.nextInt();

        // Encrypting
        int encrypted = grade + 8;
        System.out.println("Encrypted grade is: " + encrypted);

        // Decrypting
        int decrypted = encrypted - 8;
        System.out.println("Decrypted grade is: " + decrypted);

        sc.close();
    }
}