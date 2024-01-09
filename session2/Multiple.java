package session2;

import java.util.*;

public class Multiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(fM(n, m));

        in.close();
    }

    static int fM(int n, int m) {
        // define the base cases
        if (m == 1) {
            return n << 0;
        }

        if (m == 2) {
            return n << 1;
        }

        if (m != 0 && ((m & (m - 1)) == 0)) {
            return n << (int) (Math.log(m) / Math.log(2));
        } else {
            return (n << (int) (Math.floor((Math.log(m) / Math.log(2)))))
                    + fM(n, m - (1 << ((int) (Math.floor((Math.log(m) / Math.log(2)))))));
        }
    }
}
