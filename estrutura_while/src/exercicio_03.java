import java.util.Scanner;

public class exercicio_03 {
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();

        while(codigo != 4){
            if ( codigo == 1) {
                System.out.println("Alcool: " + codigo);
                codigo = sc.nextInt();
            }
            else if (codigo == 2){
                System.out.println("Gasolina: " + codigo);
                codigo = sc.nextInt();
            }
            else if (codigo == 3){
                System.out.println("Diesel: "+ codigo);
                codigo = sc.nextInt();
            }
            else {
                System.out.println("Digite um codigo de 1 a 4.");
                codigo = sc.nextInt();
            }
        }

        System.out.println("MUITO OBRIGADO");

        sc.close();

        }
    }

