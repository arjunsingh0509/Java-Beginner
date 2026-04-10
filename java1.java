import java.util.Scanner;

class java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        float s3 = sc.nextFloat();
        float s4 = sc.nextFloat();
        float s5 = sc.nextFloat();

        float sum = s1 + s2 + s3 + s4 + s5;
        float percentage = (sum / 500) * 100;

        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}