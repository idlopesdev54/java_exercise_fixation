import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D, dif;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        dif = (A * B - C * D);

        System.out.println("A diferenca de AB para CD é de: " + dif);

        sc.close();
    }
}