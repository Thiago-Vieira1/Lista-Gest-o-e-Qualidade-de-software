public class Main {
    public static void main(String[] args) {
        
        // Declaração das matrizes
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
        };
        int[][] matrizTransposta = new int[3][2]; 

        // Estrutura de repetição que transposta a matriz
        for (int i = 0;i<2;i++){
            for(int x = 0;x<3;x++){
                matrizTransposta[x][i]=matriz[i][x];
            }
        }
 
        // Estruta de repetição que imprime a matriz transposta
        for (int i = 0;i<3;i++){
            for(int x = 0;x<2;x++){
                System.out.print(matrizTransposta[i][x] + " ");
            }
            System.out.println();
        }
    }
}
