package algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectSortBook {

    public static void main(String[] args) {
        final var aNumberList = new ArrayList<Integer>();
        aNumberList.add(5);
        aNumberList.add(3);
        aNumberList.add(6);
        aNumberList.add(2);
        aNumberList.add(10);

        System.out.println(selectSort(aNumberList));
    }

    public static List<Integer> selectSort(List<Integer> array) {
        List<Integer> newArray = new ArrayList<>();

        // verifica se não está vazia
        while (!array.isEmpty()) {
            // encontra o index do menor número
            int min = findMinIndexNumber(array);
            // adiciona o valor do index da outra array na nova array,
            // o remove retorna o valor que esta sendo removido
            newArray.add(array.remove(min));
        }

        return newArray;
    }

    public static int findMinIndexNumber(List<Integer> array) {
        int min = array.get(0);
        int minIndex = 0;

        for (int i = 1; i < array.size(); i++) {
            // se o valor do indice no array for menor que o valor da variavel min, cai dai no if
            if (array.get(i) < min) {
                min = array.get(i);
                minIndex = i;
            }
        }

        return minIndex;
    }
}
