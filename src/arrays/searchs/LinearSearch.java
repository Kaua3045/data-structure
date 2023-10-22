package arrays.searchs;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual número você busca ?");
        Scanner sc = new Scanner(System.in);

        int search = sc.nextInt();

        // Busca linear
        // 10 elementos = 10 passos
        // 100 elementos = 100 passos
        boolean exists = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == search) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Achou");
        } else {
            System.out.println("Não achou");
        }
    }
}
