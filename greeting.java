/* WAP to input a name and then the compiler will print your name by greeting you simultaneously */
import java.util.Scanner;

class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 

        System.out.printf("Hello %s, Welcome!%n", name); // %s for String
        System.out.println("Hello " + name + ", Welcome!"); // concatenation

        sc.close();
    }
}