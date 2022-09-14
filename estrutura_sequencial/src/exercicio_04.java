import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int F, H;
        double S, salario;

        System.out.println("Digite o numero do funcionario: ");
        F=sc.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        H=sc.nextInt();
        System.out.println("O valor que o funcionario receber por hora: ");
        S=sc.nextDouble();
        salario=(H * S);

        System.out.println("NUMBER: " + F);
        System.out.printf("SALARY= U$ %.2f%n", salario);





        sc.close();
    }
}
