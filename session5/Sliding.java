package session5;

import java.util.Scanner;

class Sliding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int signal[] = new int[n];
        int mask[] = new int[m];

        for (int i = 0; i < n; i++) {
            signal[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            mask[i] = in.nextInt();
        }

        int result[] = new int[n + m - 1];

        
        
        for (int i = 0; i < n + m - 1; i++) {
            System.out.print(result[i] + " ");
        }

        in.close();
    }
}