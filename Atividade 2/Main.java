import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 0;
        int[] vetNum = new int[12];

        // Solicita ao usuário que digite um um número inteiro e maior que 10, caso não digite, retorna um erro e solicita novamente
        while (true) {
            System.out.print("Digite um número inteiro: ");
            try {
                n = sc.nextInt();
                
                if (n >= 10){
                    	break;
                } else {
                    System.out.println("O número deve ser maior que 10 algarismos");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                sc.next(); // Limpa a entrada inválida
            }
        }

        vetNum[0] = n % 10;
        vetNum[1] = n /10;

        // Estrutura de repetição de soma
        for (int x = 2;x < 12;x++){           
            vetNum[x] = vetNum[x-1] + vetNum[x-2];
        }

        // Imprime a sequência Fibonacci
        for (int x = 0;x < 11;x++){           
        System.out.print(vetNum[x] + " ");
        }

        sc.close();
    }
}
