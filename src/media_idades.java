import java.util.Locale;
import java.util.Scanner;

public class media_idades{
    public static void main(String[] args) {
        int soma = 0;
        int cont = 0;
        double media = 0.0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("digite as idades:");
        int idade = sc.nextInt();

        if (idade>0) {
            while (idade >= 0) {
                soma += idade;
                cont += 1;
                idade = sc.nextInt();
            }
            media = (double) soma / cont;
            System.out.printf("MÉDIA: %.2f", media);
        }else{
            System.out.println("IMPOSSIVEL CALCULAR.");
        }
    }
}