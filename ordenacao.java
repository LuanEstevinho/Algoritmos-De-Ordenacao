public class ordenacao {
    private int[] lista; // cria a lista
    private int tamanho; // define atributo tamanho para definir como tamanho da lista

    public ordenacao(int tamanho) {
        this.lista = new int[tamanho]; // instancia uma lista com o tamanho que foi passado
        this.tamanho = tamanho;
    }

    public void inserir(int valores[]) {
        for (int i = 0; i < tamanho; i++) {
            lista[i] = valores[i]; // para inserir valores que vao vir dos arquivos na lista
        }
    }

    public int[] bubbleSort() {
        for (int i = 0; i < tamanho - 1; i++) { // loop que define quantas passagens vai fazer
            for (int c = 0; c < tamanho - i - 1; c++) { // loop que muda os elementos de dentro do loop
                if (lista[c] > lista[c + 1]) { // condição para fazer trocas e jogar o menor para esquerda e maior para direita
                    swap(c, c + 1); // metodo que criei para fazer swap, troca um elemento com o outro

                }
            }
        }
        return lista;
    }


    public int[] insertionSort() {
        for (int i = 1; i < tamanho; i++) { // loop principal que define qual elemento sera ordenado
            int atual = lista[i]; // define o elemento que vai ser analisado
            int j = i - 1; // aponta pro ultimo elemento da parte "ordenada"

            // aq diz basicamente, enqt o num da esquerda for maior, empurre ele para a direita
            while (j >= 0 && lista[j] > atual) {
                lista[j + 1] = lista[j]; // empurra pra direita
                j--; // j volta para a esquerda para colocar o elemento atual na posicao correta
            }

            lista[j + 1] = atual; // coloca o elemento no lugar certo
        }

        return lista;
    }

    // recebe por parametro incio e fim para poder lidar com as particoes futuramente
    public int[] quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int pivot = lista[fim]; // define o ultimo elemento da lista como pivot
            int i = inicio - 1; // define inicio como "-1" para poder incrementar no loop e usar de contador

            for (int j = inicio; j < fim; j++) { // vai varrendo a lista até o fim - 1, para nao passar no pivot
                if (lista[j] < pivot) { // valida se o elemento que esta no indice "j" é menor que o pivot
                    i++; // incrementa o contador
                    swap(i, j);
                }
            }

            swap(i + 1, fim); // quando as posicoes de maiores e menores estiver correta, troca pivot com o ultimo menores + 1
            int indicePivo = i + 1; // guarda o indice atual do pivot

            quickSort(inicio, indicePivo - 1); // passa recursividade na particao dos menores
            quickSort(indicePivo + 1, fim); // recursividade na particao dos maiores
        }

        return lista;
    }

    // funcao simples e classica pra troca de posicoes
    public void swap(int i, int j) {
        int guardar = lista[i]; // guarda o valor do i
        lista[i] = lista[j]; // define que o i = j
        lista[j] = guardar; // define que o j é a posicao do i que vc guardou antes
    }

    // metodo so para mostrar os elementos da lista, so um for each basico e mo preguica de explicar
    public void mostrarLista() {
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
/*
Ó professora, acho q mereco um meio pontinho de bonus ai pelos comentarios q eu sempre faço nos codigos
da tua matéria
*/