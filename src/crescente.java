import java.util.Locale;
import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        int n1;
        int n2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite 2 números: ");
//        n1 = sc.nextInt();
//        n2 = sc.nextInt();
//
//        while(n1 != n2) {
//
//            if (n1 < n2){
//                System.out.println("CRESCENTE");
//            }else {
//                System.out.println("DECRESCENTE");
//            }
//
//            System.out.println("digite outros 2 nùmeros");
//            n1 = sc.nextInt();
//            n2 = sc.nextInt();
//
//        }

        do{
           n1 = sc.nextInt();
           n2 = sc.nextInt();

            if (n1<n2){
                System.out.println("CRESCENTE");
                System.out.println("digite outros 2 nùmeros");
            }else if (n2<n1){
                System.out.println("DECRESCENTE");
                System.out.println("digite outros 2 nùmeros");
            }else{
                System.out.print("");
            }

        } while(n1!=n2);
    }
}
