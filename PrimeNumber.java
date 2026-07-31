import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        boolean prime = true;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
}
