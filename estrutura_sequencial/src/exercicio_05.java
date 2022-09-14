import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int P1, Q1, P2, Q2;
        double V1, V2, pagar;

        System.out.println("Digite o numero da peça: ");
        P1 = sc.nextInt();
        System.out.println("Digite a quantidade desejada: ");
        Q1 = sc.nextInt();
        System.out.println("Digite a valor unitario da peça: ");
        V1 = sc.nextDouble() * Q1;
        System.out.println("Digite o numero da peça: ");
        P2 = sc.nextInt();
        System.out.println("Digite a quantidade desejada: ");
        Q2 = sc.nextInt();
        System.out.println("Digite a valor unitario da peça: ");
        V2 = sc.nextDouble() * Q2;

        pagar = V1 + V2;

        System.out.printf("Codigo " + P1 + " e " + P2 + " / VALOR A PAGAR: U$ %.2f%n", pagar);

        sc.close();
    }
}
