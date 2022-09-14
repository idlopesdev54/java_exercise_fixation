import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, soma;
        
        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("A soma de " + a + " + " + b + " é igual = " + soma);

        sc.close();

    }
}
