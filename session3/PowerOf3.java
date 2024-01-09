package session3;

import java.util.Scanner;

/*
 * 
 * check whether the number is a factorial 
 * or prime number
 * or fibonacci number
 * or even number
 * or power of 2
 * or power of 3
 */

public class PowerOf3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (isPowerOf3(number)) {
            System.out.println(number + " is a power of 3");
        } else {
            System.out.println(number + " is not a power of 3");
        }

        in.close();
    }

    static boolean isPowerOf3(int number) {
        // Generate all the power of 3 less than the number
        
    }
}
