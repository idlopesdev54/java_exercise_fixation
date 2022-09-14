import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco, total;

        if(codigo == 1) {
            preco = 4.00;
            total = quantidade * preco;
            System.out.printf("Cachorro quente custa %.2f%n", total);
        }else if (codigo == 2) {
            preco = 4.50;
            total = quantidade * preco;
            System.out.printf("X-salada custa %.2f%n", total);
        }else if (codigo == 3) {
            preco = 5.00;
            total = quantidade * preco;
            System.out.printf("X-Bacon custa %.2f%n", total);
        }else if (codigo == 4) {
            preco = 2.00;
            total = quantidade * preco;
            System.out.printf("Torrada simples custa %.2f%n", total);
        }else if (codigo == 5) {
            preco = 1.50;
            total = quantidade * preco;
            System.out.printf("Refrigerante custa %.2f%n", total);
        } 

        System.out.println("VOLTE SEMPRE!");

        //tambem poderia ter colocado apenas o System out dos ifs no final

        sc.close();



    }
    
}
