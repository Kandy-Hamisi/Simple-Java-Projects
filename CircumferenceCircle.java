import java.util.Scanner;

public class CircumferenceCircle {
    public static Scanner sc;

    public static void main(String[] args) {

        final float PI =  (float) 3.14159;

        float diameter, circumference;

        sc = new Scanner(System.in);

        System.out.println("\nEnter the diameter of the circle: ");
        diameter = sc.nextFloat();

        circumference = PI * diameter;

        System.out.println("The Circumference of the circle is: "+circumference);

        
    }
}
