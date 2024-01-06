import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor das Coordenadas X e Y: ");
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        while(X != 0 && Y != 0){
            if (X>0 && Y>0){
                System.out.println("QUADRANTE Q1");
            }else if (X<0 && Y<0) {
                System.out.println("QUADRANTE Q3");
            }else if (X<0 && Y>0){
                System.out.println("QUADRANTE Q2");
            }else if (X>0 && Y<0){
                System.out.println("QUADRANTE Q4");
            }
            System.out.println("Digite o Valor das Coordenadas X e Y: ");
            X = sc.nextDouble();
            Y = sc.nextDouble();
        }
    }
}
