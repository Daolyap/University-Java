import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("We will now provide you with the sum of a number. Hopefully it equals 67.");
        System.out.println("Multiplied number is: " + outputFunction());
    }

    public static int outputFunction() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.println("Your number is: " + num1);

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        System.out.println("The sum of the two numbers is: " + (num1 + num2));

        if ((num1 + num2) != 67) {
            System.out.println("Wrong number!!!");
        } 
        else{
            System.out.println("YIPPEEEEE!!!!!");
        }
        return (num1 * num2);
    }
}