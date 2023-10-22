package arrays.comparation;

import arrays.linkedlist.IteratorLinkedList;
import arrays.linkedlist.LinkedList;

import java.util.ArrayList;

public class VectoVsLinkedListPerform {

    public static void main(String[] args) {
        // 61, 64, 70
        LinkedList<Integer> list = new LinkedList<>();

        // 17, 18, 23
        ArrayList<Integer> vetor = new ArrayList<>();

        // Adicionar elementos
        int limit = 1000000;
        long initialTime = System.currentTimeMillis();
        long finalTime;

        for (int i = 0; i < limit; i++) {
            vetor.add(i);
        }
        finalTime = System.currentTimeMillis();

        System.out.println("Adicionou " + limit + " elementos no vetor");
        System.out.println(finalTime - initialTime);

        initialTime = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            list.add(i);
        }
        finalTime = System.currentTimeMillis();

        System.out.println("Adicionou " + limit + " elementos na lista");
        System.out.println(finalTime - initialTime);

        // ler valores
        initialTime = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }
        finalTime = System.currentTimeMillis();

        System.out.println("Tempo de leitura do vetor");
        System.out.println(finalTime - initialTime);

        initialTime = System.currentTimeMillis();
        IteratorLinkedList<Integer> iterator = list.getIterator();

        while (iterator.haveNext()) {
            iterator.getNext();
        }
        finalTime = System.currentTimeMillis();

        System.out.println("Tempo de leitura da lista");
        System.out.println(finalTime - initialTime);
    }
}
