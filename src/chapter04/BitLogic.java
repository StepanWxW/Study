package chapter04;

public class BitLogic {
    public static void main(String[] args) {
        String bnary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101",
                "0110", "0111", "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0+2+1 или 011 в двоичном представлении
        int b = 6; // 4 + 2 + 0 0110
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println(" a = " + bnary[a]);
        System.out.println(" b = " + bnary[b]);
        System.out.println(" a | b = " + bnary[c]);
        System.out.println(" a & b = " + bnary[d]);
        System.out.println(" a ^ b = " + bnary[e]);
        System.out.println(" (~a & b) | (a & ~b) = " + bnary[f]);
        System.out.println(" ~a & 0x0f = " + bnary[g]);
    }
}
