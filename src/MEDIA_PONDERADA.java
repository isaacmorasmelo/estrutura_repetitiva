import java.util.Locale;
import java.util.Scanner;

public class MEDIA_PONDERADA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos casos você vai digitar? ");
        double p1 = 2;
        double p2 = 3;
        double p3 = 5;
        int q = sc.nextInt();


        for(int a = 0; a < q; a++){
            System.out.println("Digite 3 números: ");
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();

            v1 *= p1;
            v2 *= p2;
            v3 *= p3;
            double m = (v1+v2+v3)/10;
            System.out.printf("média: %.1f\n",m);
        }
    }
}
