import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis
        int n = 0;
        double s = 0;

        // Solicita ao usuário que digite um um número inteiro, caso não digite, retorna um erro e solicita novamente
        while (true) {
            System.out.print("Digite um número inteiro: ");
            try {
                n = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                sc.next(); // Limpa a entrada inválida
            }
        }

        // Estrutura de repetição que calcula a expressão
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        
        System.out.println("A soma da série é: " + s);

        sc.close();
    }
}
