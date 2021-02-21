import java.util.Scanner;

public class KshToUSD {
    
    public static Scanner sc;

    public static void main(String[] args) {

        final float USD = (float) 110.0;
        float amount, final_amount;

        sc = new Scanner(System.in);

        System.out.println("\nEnter the amount in KSH: ");
        amount = sc.nextFloat();

        final_amount = amount / USD;

        System.out.println(amount+ " Ksh to USD is " +final_amount+ " dollars");
        
    }
}
