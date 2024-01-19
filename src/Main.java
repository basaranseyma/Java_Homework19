import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n;
        n = sc.nextInt();
        if (n > 0) {
            System.out.println("The powers of 4 up to the number you enter: ");
            for (int i = 1; i < n; i *= 4) { // The zeroth power of any number is 1. That's why I started with i = 1.
                System.out.println(i);
            }
            System.out.println("The powers of 5 up to the number you enter: ");
            for (int i = 1; i < n; i *= 5) { // The zeroth power of any number is 1. That's why I started with i = 1.
                System.out.println(i);
            }
        } else {
            System.out.println("Please enter a number greater than zero!");
        }
    }
}