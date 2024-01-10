import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {
    public static void main(String[] args) {
        int ns;
        int d=0;
        int f=0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros você vai digitar? ");
        int qn = sc.nextInt();

        for(int a = 0; a < qn; a+=1){
            System.out.println("digite um número: ");
            int n = sc.nextInt();

            if(n>=10 && n<=20){
                d += 1;
            }else{
                f += 1;
            }
        }
        System.out.printf("%d dentro\n",d);
        System.out.printf("%d fora\n",f);
    }
}
