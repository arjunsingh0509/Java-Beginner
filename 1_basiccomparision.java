/* using comparision operators to find whether a given number is 
greater than the user entered a number or not */
import java.util.Scanner;
class 1_basiccomparision{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int x=50;
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(x>num){
            System.out.print("Entered Number is smaller than the given number");
        }
        else if(x<num){
            System.out.print("Entered Number is greater than the given number");
        }
        else{
            System.out.print("Entered Number is equal to the given number");
        }
    }
}