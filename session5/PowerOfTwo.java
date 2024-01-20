package session5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the number from the user
        int N = in.nextInt();

        // Write the respective number series in a list
        // 1, 2, 4, 8, 16, 32, 64, 128, ...

        // Initialize the first number of the series to a variable
        int number = 1;

        // Generate the next number in the series from the second number as long as the
        // number < than N.
        while (number < N) {
            number = number * 2;
        }
        // After the loop, check if the last number in the series we generated is equal
        // to N.
        if (number == N) {
            System.out.println(N + " is a power of 2");
        } else {
            System.out.println(N + " is not a power of 2");
        }
        in.close();
    }
}
