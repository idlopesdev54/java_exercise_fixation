import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi;

        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * (raio * raio);

        System.out.printf("O raio da casa é %.4f%n", area);

        sc.close();
    }
    
}
