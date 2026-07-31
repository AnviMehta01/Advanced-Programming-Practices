import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if (a > b) {
            if (a > c)
                System.out.println("Largest = " + a);
            else
                System.out.println("Largest = " + c);
        } else {
            if (b > c)
                System.out.println("Largest = " + b);
            else
                System.out.println("Largest = " + c);
        }

        sc.close();
    }
}