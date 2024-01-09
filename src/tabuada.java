import java.util.Locale;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor?");
        int n = sc.nextInt();
        int o=10;

        for (int i=1;i<=o;i+=1){
            int v = n*i;
            System.out.printf("4 x %d= %d\n",i,v);
        }
    }
}
