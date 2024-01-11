import java.util.Locale;
import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros você vai digitar? ");
        int qn = sc.nextInt();

        for(int a = 0; a < qn; a+=1){
            System.out.println("digite um número: ");
            int n = sc.nextInt();

            if(n==0){
                System.out.println("NULO");
            }
            else if(n>0 && n%2 == 0){
                System.out.println("PAR");
            }else if(n>0 && n%2 != 0){
                System.out.println("IMPAR");
            }else if (n < 0 && n % 2 == 0){
                System.out.println("PAR NEGATIVO");
            } else {
                System.out.println("IMPAR NEGATIVO");
            }
        }
    }
}
