Esse repositório contém a implementação de 3 algoritmos clássicos de ordenação, sendo eles: Bubble Sort, Insertion Sort e Quick Sort.
Cada um possue características em relação a eficiência e metodo de funcionamento.

## BUBBLE SORT
- O Bubble Sort é o método mais simples entre os três.
Ele funciona comparando pares de elementos vizinhos e trocando suas posições sempre que estão fora de ordem.
Essas trocas se repetem várias vezes até que todos os elementos estejam organizados corretamente.

- Ideia principal: trocar elementos vizinhos fora de ordem até que tudo esteja ordenado.
- Pontos fortes: fácil de entender e implementar. 
- Limitação: se torna muito lento para listas grandes.

## INSERTION SORT
- O Insertion Sort ordena os elementos de forma gradual.
Ele percorre a lista e insere cada novo elemento na posição correta dentro da parte já ordenada, como se estivéssemos organizando cartas em um baralho.

- Ideia principal: inserir cada elemento na posição certa dentro da lista ordenada.
- Pontos fortes: rápido para listas pequenas ou quase ordenadas.
- Limitação: ineficiente para grandes volumes de dados desordenados.

## QUICK SORT
- O Quick Sort utiliza a técnica de divisão e conquista para ordenar os elementos de forma mais eficiente.
Ele escolhe um pivô e divide a lista em duas partes: uma com elementos menores e outra com elementos maiores que o pivô.
Depois, repete esse processo recursivamente até que tudo esteja em ordem.

- Ideia principal: dividir a lista em partes menores com base em um pivô.
- Pontos fortes: um dos métodos mais rápidos e eficientes para grandes listas.
- Limitação: pode atingir O(n²) em casos desfavoráveis (quando o pivô é mal escolhido).
