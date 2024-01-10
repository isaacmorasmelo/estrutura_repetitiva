import java.util.Locale;
import java.util.Scanner;

public class soma_impares {
    public static void main(String[] args) {
        int x1,x2,i = 0;
        int soma = 0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite 2 números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1>n2){
            x1 = n2;
            x2 = n1;
        } else {
            x1 = n1;
            x2 = n2;
        }

        for (i = x1+1; i < x2; i++) {
            if(i % 2 != 0){
                soma += i;
            }
        }
        System.out.printf("SOMA DOS IMPARES = %d",soma);
    }
}
