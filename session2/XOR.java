package session2;

// Let's say we have a list of numbers where all the numbers has a pair except one. Find the number without a pair. (Hint: XOR)

public class XOR {
    public static void main(String[] args) {
        // System.out.println((int) ((Math.log(17) / Math.log(2))));
        System.out.println(10 - (10 << ((int) Math.floor(Math.log(5) / Math.log(2)))));
    }
}
