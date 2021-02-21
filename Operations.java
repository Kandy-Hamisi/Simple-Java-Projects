
import java.util.Scanner;

public class Operations {

    private static Scanner sc;

    public static void main(String[] args) {
        
        int a, b, sum, difference, division, product;
        sc = new Scanner(System.in);

        System.out.println("\nEnter your first number: ");
        a = sc.nextInt();

        System.out.println("Enter your second number: ");
        b = sc.nextInt();

        sum = a + b;
        difference = a - b;
        division = a / b;
        product = a * b;

        System.out.println("\nThe sum is " +sum);
        System.out.println("\nThe difference is " +difference);
        System.out.println("\nThe division is " +division);
        System.out.println("\nThe product is " +product);

        
    }
}
