public class ordenacao {
    private int[] lista;
    private int tamanho;

    public ordenacao(int tamanho) {
        this.lista = new int[tamanho];
        this.tamanho = tamanho;
    }

    public void inserir(int valores[]) {
        for (int i = 0; i < tamanho; i++) {
            lista[i] = valores[i];
        }
    }

    public int[] bubbleSort() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int c = 0; c < tamanho - i - 1; c++) {
                if (lista[c] > lista[c + 1]) {
                    swap(c, c + 1);
                }
            }
        }
        return lista;
    }


    public int[] insertionSort() {
        for (int i = 1; i < tamanho; i++) {
            int atual = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > atual) {
                lista[j + 1] = lista[j];
                j--;
            }

            lista[j + 1] = atual;
        }

        return lista;
    }


    public int[] quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int pivot = lista[fim];
            int i = inicio - 1;

            for (int j = inicio; j < fim; j++) {
                if (lista[j] < pivot) {
                    i++;
                    swap(i, j);
                }
            }
            int[] lista2 = new int[lista.length];
            swap(i + 1, fim);
            int indicePivo = i + 1;

            quickSort(inicio, indicePivo - 1);
            quickSort(indicePivo + 1, fim);
        }

        return lista;
    }


    public void swap(int i, int j) {
        int guardar = lista[i];
        lista[i] = lista[j];
        lista[j] = guardar;
    }

    public void mostrarLista() {
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
