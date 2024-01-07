import java.util.Locale;
import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        int c = sc.nextInt();

        int a = 0;
        int g = 0;
        int d = 0;

        while(c!=4) {
            while (1 == c) {
                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                c = sc.nextInt();
                a += 1;
            }

            while (c == 2) {
                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                c = sc.nextInt();
                g += 1;
            }

            while (c == 3) {
                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                c = sc.nextInt();
                d += 1;
            }

            while (c > 4 || c < 1) {
                System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                c = sc.nextInt();
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("alcool: %d\n", a);
        System.out.printf("gasolina: %d\n",g);
        System.out.printf("diesel: %d",d);
    }
}
