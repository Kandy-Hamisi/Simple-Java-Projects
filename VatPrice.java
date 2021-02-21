import java.util.Scanner;

public class VatPrice {
    
    private static Scanner sc;

    public static void main(String[] args) {

        int quantity;
        float unit_price, total_price;
        double vat, new_total;

        sc = new Scanner(System.in);

        System.out.println("\nPlease enter the quantity purchased; ");
        quantity = sc.nextInt();
        
        System.out.println("\nPlease enter the unit price of the Items: ");
        unit_price = sc.nextFloat();

        total_price = quantity * unit_price;
        System.out.println("\nThe total price of the Items bought is "+total_price);

        // Calculating VAT
        vat = 0.16 * total_price;
        System.out.println("\nThe VAT is "+vat);

        // new total price inclusive VAT

        new_total = vat + total_price;
        System.out.println("The total cost inlcusive VAT is: "+new_total);



    }
}
