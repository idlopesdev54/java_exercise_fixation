import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não sao multiplos");
        }

        sc.close();

    }
}
