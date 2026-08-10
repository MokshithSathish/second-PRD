
import java.util.Scanner;

public class next {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("age is: " + age);

        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        System.out.println("height is: " + height);

        sc.nextLine();

        System.out.println("Enter your Full Name: ");
        String fname = sc.nextLine();
        System.out.println("Full Name is: " + fname);

    }
}
