public class main {
    public static void main(String[] args) {
        ordenacao teste = new ordenacao(10);

        int[] listaInserir = {5,2,3,1,9,7,8,10,4,6};

        teste.inserir(listaInserir);
        //teste.bubbleSort();
        //teste.mostrarLista();


        //for (int valor : listaInserir) {
          //  teste.insertionSort(valor);
        //}

        teste.quickSort(0, listaInserir.length - 1);

        teste.mostrarLista();
    }
}
