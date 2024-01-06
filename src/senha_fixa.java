import java.util.Locale;
import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.print("Senha Inválida! Tente Novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("acesso permitido!");
    }
}
