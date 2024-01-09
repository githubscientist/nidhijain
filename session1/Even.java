
/*
 * Problem: Given a number N, check whether the number is a even number or an
 * odd number.
 * 
 * Algorithm 1: Divisibility by 2
 * 
 * Check whether the number is divisible by 2
 * if true => even number
 * else => odd number
 * 
 * Algorithm 2: Checking the last digit
 * 
 * find the last digit of the number
 * check if the last digit is one of [0, 2, 4, 6, 8]
 * if true => even number
 * else => odd number
 * 
 * Algorithm 3: Increasing 2 number series
 * 
 * initialize a variable to hold the even numbers starting from 0
 * iteratively we compare the even number with N as long as even < N
 * after the iteration,
 * if the number N is equal to the even number
 * then => its a even number
 * else => its an odd number
 * 
 * Algorith 4:
 * 
 * Homework: to brainstorm yourself about the different ways / algorithms to
 * solve the problem.
 * 
 */
import java.util.*;

class Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int even;
        for (even = 0; even < number; even += 2);
        if (even == number) {
            System.out.println(number + " is a even number");
        } else {
            System.out.println(number + " is an odd number");
        }
        in.close();
    }
}