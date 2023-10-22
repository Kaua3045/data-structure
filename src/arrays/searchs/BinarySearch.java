package arrays.searchs;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] vetor = new int[1000000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        System.out.println("Qual número você busca ?");
        Scanner sc = new Scanner(System.in);
        int buscado = sc.nextInt();

        int counter = 0;
        boolean exists = false;
        int inicio = 0;
        int fim = vetor.length - 1; // pq o tamanho é o 8 mas a última posição é 7 (começa do zero)
        int meio;

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            counter++;

            if (vetor[meio] == buscado) {
                exists = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Quantidade de testes " + counter);

        if (exists) {
            System.out.println("Achou");
        } else {
            System.out.println("Não achou");
        }
    }
}
