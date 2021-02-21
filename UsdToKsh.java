import java.util.Scanner;


public class UsdToKsh {
    
    public static Scanner sc;

    public static void main(String[] args) {

        final float USD = (float) 110.0;
        float amount, final_amount;

        sc = new Scanner(System.in);

        System.out.println("\nEnter your amount to convert in USD: ");
        amount = sc.nextFloat();

        final_amount = amount * USD;
        System.out.println(amount+ " USD converted to KSHS is "+final_amount+ " Kenyan Shillings.");

        
    }

    
}
