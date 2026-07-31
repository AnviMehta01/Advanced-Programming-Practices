import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, reverse = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}