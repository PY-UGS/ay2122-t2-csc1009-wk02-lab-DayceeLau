import java.util.Scanner;

public class Wk02Q1 
{
    static final double pi = 3.14159;
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a byte value: ");
        byte byteValue = scan.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = scan.nextShort();

        System.out.print("Enter a int value: ");
        int intValue = scan.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = scan.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = scan.nextFloat();

        System.out.println("Byte value: "+ byteValue + ", Short value: "+ shortValue +
        ", Int value: " + intValue + ",Long value: " + longValue + 
        ",Float value: " + floatValue);
        System.out.println("---------------------------------------------------------------");

        System.out.print("Enter a number for radius: ");
        double radius = scan.nextDouble();

        double aoc;
        aoc = radius*radius*pi;
        System.out.println("The area for the circle of radius " + radius + " is "
        + aoc);
    }
}
