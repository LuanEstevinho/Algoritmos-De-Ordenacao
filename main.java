import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // fiz aq uma lista c os 9 arqv pra poder meter no for each e ir lendo td a milhao
        String[] arquivos = {
                "aleatorio_100.csv",
                "aleatorio_1000.csv",
                "aleatorio_10000.csv",
                "crescente_100.csv",
                "crescente_1000.csv",
                "crescente_10000.csv",
                "decrescente_100.csv",
                "decrescente_1000.csv",
                "decrescente_10000.csv"
        };

        // varre td os arquivo da lista ali em cima
        for (String nomeArquivo : arquivos) {
            System.out.println("==================================================");
            System.out.println("Processando arquivo: " + nomeArquivo);
            System.out.println("==================================================");

            int[] listaInserir = null; // criado dps d contar

            try {
                File arquivo = new File(nomeArquivo);

                // conta a qtd de num q tem no arqv pra poder definir tamanho
                Scanner contador = new Scanner(arquivo);
                int tamanho = 0;
                while (contador.hasNextInt()) {
                    contador.nextInt();
                    tamanho++;
                }
                contador.close();

                // cria o array e le os num dnv
                listaInserir = new int[tamanho];
                Scanner leitor = new Scanner(arquivo);
                int i = 0;
                while (leitor.hasNextInt() && i < tamanho) {
                    listaInserir[i] = leitor.nextInt();
                    i++;
                }
                leitor.close();

            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado: " + nomeArquivo);
                continue; // pula para o próximo arquivo
            }

            // ========================================= BUBBLE SORT =========================================
            ordenacao bubble = new ordenacao(listaInserir.length);
            bubble.inserir(listaInserir.clone());

            System.out.println("Ordenação com Bubble Sort:");
            long inicio = System.nanoTime();
            bubble.bubbleSort();
            long fim = System.nanoTime();
            bubble.mostrarLista();
            System.out.println("Tempo Bubble Sort: " + (fim - inicio) + " ns\n");

            // ========================================= INSERTION SORT =========================================
            ordenacao insertion = new ordenacao(listaInserir.length);
            insertion.inserir(listaInserir.clone());

            System.out.println("Ordenação com Insertion Sort:");
            inicio = System.nanoTime();
            insertion.insertionSort();
            fim = System.nanoTime();
            insertion.mostrarLista();
            System.out.println("Tempo Insertion Sort: " + (fim - inicio) + " ns\n");

            // ========================================= QUICK SORT =========================================
            ordenacao quick = new ordenacao(listaInserir.length);
            quick.inserir(listaInserir.clone());

            System.out.println("Ordenação com Quick Sort:");
            inicio = System.nanoTime();
            quick.quickSort(0, listaInserir.length - 1);
            fim = System.nanoTime();
            quick.mostrarLista();
            System.out.println("Tempo Quick Sort: " + (fim - inicio) + " ns\n");
        }
    }
}
