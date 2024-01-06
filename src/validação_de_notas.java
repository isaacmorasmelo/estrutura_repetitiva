import java.util.Locale;
import java.util.Scanner;

public class validação_de_notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a primeira nota: ");
        double pn = sc.nextDouble();

        while (pn<0 || pn>10){
            System.out.println("Nota Inválida! Tente Novamente: ");
            pn = sc.nextDouble();
        }

        System.out.print("digite a segunda nota: ");
        double sn = sc.nextDouble();

        while (sn<0 || sn>10){
            System.out.println("Nota Inválida! Tente Novamente:");
            sn = sc.nextDouble();
        }

        double m = (pn+sn)/2;
        System.out.printf("MÉDIA: %.2f",m);
    }
}
