import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int m = -1;

        while (n <= 1) {
            System.out.print("Por favor, insira um número maior que 1: ");
            if (scanner.hasNextInt()) { // Validação se valor é inteiro
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("O número deve ser positivo. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa a entrada inválida e solicita novamente
            }
        }

        while (m < 0) {
            System.out.print("Insira o valor de repetições: ");
            if (scanner.hasNextInt()) { // Validação se valor é inteiro
                m = scanner.nextInt();
                if (m <= 0) {
                    System.out.println("O número deve ser positivo. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa a entrada inválida e solicita novamente
            }
        }

        for (int i = 0; i < m; i++) {
            // Se a iteração for par, imprime em crescente
            if (i % 2 == 0) {
                for (int j = 0; j <= n; j++) {
                    System.out.print(j + " ");
                }
            } else { // Se a iteração for ímpar, imprime em decrescente
                for (int j = n; j >= 0; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // Nova linha após cada sequência
        }

        scanner.close();
    }
}
