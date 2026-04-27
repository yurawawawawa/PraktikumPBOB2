/**
 * File      : Soal1.java
 * Nama / NIM : Arga Yura Danendra / 24060124140191
 * Polimorfisme Coercion
 */

public class Soal1 {
    public static void main(String[] args) {

        int nilai = 65;

        System.out.println("Integer : " + nilai);
        System.out.println("Char    : " + (char) nilai);
        System.out.println("Double  : " + (double) nilai);

        double real = nilai;
        int balik = (int) real;
        System.out.println("Balik ke int : " + balik);

        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S = " + S);
        System.out.println("Z = " + Z);

        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R = " + R);
        System.out.println("D = " + D);

        Integer A = Integer.parseInt(S);
        System.out.println("A = " + A);

        String T = Integer.toString(A);
        System.out.println("T = " + T);
    }
}