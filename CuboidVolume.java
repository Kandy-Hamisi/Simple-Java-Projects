
// Calculates the volume of a cuboid
// Allows user to input height, width and height

// Volume = length * width * height

import java.util.Scanner;

public class CuboidVolume{
    private static Scanner sc;
    public static void main(String[] args){
        float length, width, height, volume;
        sc = new Scanner(System.in);

        System.out.println("\nEnter the length: ");
        length = sc.nextFloat();

        System.out.println("\nEnter the width: ");
        width = sc.nextFloat();

        System.out.println("\nEnter the height: ");
        height = sc.nextFloat();

        volume = length * width * height;
        System.out.println("\nThe volume of the cuboid is: "+ volume);
    }
}