package arrays;

import java.util.Scanner;

public class StringVectorAndLinearSearch {

    public static void main(String[] args) {
        String[] states = new String[10];

        states[0] = "AC";
        states[1] = "BA";
        states[2] = "CE";
        states[3] = "DF";
        states[4] = "AM";
        states[5] = "AP";
        states[6] = "PB";
        states[7] = "RN";
        states[8] = "MS";
        states[9] = "SP";

        for (int i = 0; i < states.length; i++) {
            System.out.println("Estado " + i + ": " + states[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sigla de estado você quer buscar ?");

        String search = sc.nextLine();

        // Busca linear nem sempre é boa, por que quanto maior o vetor maior o tempo de busca.
        for (int i = 0; i < states.length; i++) {
            if (states[i].equalsIgnoreCase(search)) {
                System.out.println("Sigla encontrada!");
                break;
            }
        }
        System.out.println("sigla não encontrada!");
    }
}
