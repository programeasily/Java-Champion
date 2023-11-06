package part1.lesson11;

public class BitwiseOperator {
    public static void main(String[] args)
    {

        System.out.println(2 >>> 2);

        // Initial values
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);
    }
}
