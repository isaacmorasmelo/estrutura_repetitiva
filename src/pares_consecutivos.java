import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int x = sc.nextInt();
        int calc = 0;

        while (x != 0) {
            if(x%2==0) {
                if (x % 2 == 0) {
                    calc += x;
                }
                if ((x + 1) % 2 == 0) {
                    calc += x + 1;
                }
                if ((x + 2) % 2 == 0) {
                    calc += x + 2;
                }
                if ((x + 3) % 2 == 0) {
                    calc += x + 3;
                }
                if ((x + 4) % 2 == 0) {
                    calc += x + 4;
                }
                if ((x + 5) % 2 == 0) {
                    calc += x + 5;
                }
                if ((x + 6) % 2 == 0) {
                    calc += x + 6;
                }
                if ((x + 7) % 2 == 0) {
                    calc += x + 7;
                }
                if ((x + 8) % 2 == 0) {
                    calc += x + 8;
                }
            } else {
                if (x % 2 == 0) {
                    calc += x;
                }
                if ((x + 1) % 2 == 0) {
                    calc += x + 1;
                }
                if ((x + 2) % 2 == 0) {
                    calc += x + 2;
                }
                if ((x + 3) % 2 == 0) {
                    calc += x + 3;
                }
                if ((x + 4) % 2 == 0) {
                    calc += x + 4;
                }
                if ((x + 5) % 2 == 0) {
                    calc += x + 5;
                }
                if ((x + 6) % 2 == 0) {
                    calc += x + 6;
                }
                if ((x + 7) % 2 == 0) {
                    calc += x + 7;
                }
                if ((x + 8) % 2 == 0) {
                    calc += x + 8;
                }
                if ((x + 9) % 2 == 0) {
                    calc += x + 9;
                }
                if ((x + 10) % 2 == 0) {
                    calc += x + 10;
                }
            }
                System.out.printf("SOMA: %d\n", calc);
                calc -= calc;
                System.out.println("digite um numero inteiro: ");
                x = sc.nextInt();
        }
    }
}