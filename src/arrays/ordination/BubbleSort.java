package arrays.ordination;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        // bubble sort
        // multiplicando os dois já que temos dois O(N) fica O(N²)
        int aux;
        for (int i = 0; i < vetor.length; i++) { // O(N)

            // pega o próximo valor de i
            for (int j = i + 1; j < vetor.length; j++) { // O(N-1) ou O(N) MAIS COMUM

                // verifica se o i é maior que j
                if (vetor[i] > vetor[j]) {
                    // passa o valor de j para a variavel aux
                    aux = vetor[j];

                    // passa o valor de i para o lugar do j
                    vetor[j] = vetor[i];

                    // passa o valor de aux para o lugar de i
                    vetor[i] = aux;

                    // no final temos um vetor ordenado do menor para o maior
                    // já que o j vai ser menor que i o i vai para o lugar do j e o j vem para o lugar do i
                }
            }
        }

        System.out.println("Vetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
