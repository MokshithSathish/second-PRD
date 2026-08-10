
import java.util.Scanner;

public class input1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a byte value: ");
        byte a = sc.nextByte();
        System.out.println("byte value is; " + a);

        System.out.println("Enter a short value: ");
        short b = sc.nextShort();
        System.out.println("short value is; " + b);

        System.out.println("Enter a long value: ");
        long c = sc.nextLong();
        System.out.println("long value is; " + c);

        System.out.println("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.println("double value is; " + d);

        System.out.println("Enter a float value: ");
        float e = sc.nextFloat();
        System.out.println("float value is; " + e);

        System.out.println("ENter a Boolean value: ");
        boolean f = sc.nextBoolean();
        System.out.println("boolean value is: " + f);
    }
}
