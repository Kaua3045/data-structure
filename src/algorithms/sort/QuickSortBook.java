package algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortBook {

    public static void main(String[] args) {
        quicksort(List.of(45, 28, 37, 25, 100, 500, 199, 383, 96))
                .forEach(System.out::println);
//        System.out.println(sumArrayRecursive(List.of(1, 2, 3, 4)));
//        System.out.println(sumTotalArraySize(List.of(1, 2, 3, 4)));
//        System.out.println(getBiggerNumberInArray(List.of(1, 4, 3, 2)));
//        System.out.println(binarySearchRecursive(List.of(1, 2, 3, 4), 0, 3, 4));
    }
    
    public static List<Integer> quicksort(List<Integer> numbers) {
        // caso-base se o array for menor que 2, não tem o que ordenar, então retorna
        if (numbers.size() < 2) {
            return numbers;
        }

        // pivo, pode ser qualquer número, por facilidade, sempre pegamos o primeiro
        int pivo = numbers.get(0);

        // criamos os arrays que iram conter os menores e maiores
        List<Integer> menores = new ArrayList<>();
        List<Integer> maiores = new ArrayList<>();

        // fazemos um for iniciando do 1, por que já pegamos o 0, esse for passa por todo o array
        for (int i = 1; i < numbers.size(); i++) {
            // pegamos o elemento do indice, só pra facilitar
            int elemento = numbers.get(i);

            // verificamos se o elemento atual é menor ou igual ao pivo, se for menor ou igual colocamos
            // no array de menores elementos
            if (elemento <= pivo) {
                menores.add(elemento);
            } else {
                // caso então seja maior que o pivo, colocamos no array de maiores elementos
                maiores.add(elemento);
            }
        }

        // criamos um array pro resultado
        List<Integer> resultado = new ArrayList<>();

        // chama o addAll que adiciona um lista, pega e faz a chamada recursiva passando o array menores
        // e ai adiciona ao resultado
        resultado.addAll(quicksort(menores));

        // adiciona o pivo ao resultado
        resultado.add(pivo);

        // chama o addAll que adiciona um lista, pega e faz a chamada recursiva passando o array maiores
        // e ai adiciona ao resultado
        resultado.addAll(quicksort(maiores));

        return resultado;
    }

//    public static int sumArrayRecursive(List<Integer> numbers) {
//        if (numbers.isEmpty()) {
//            return 0;
//        }
//
//        if (numbers.size() == 1) {
//            return numbers.get(0);
//        }
//
//        return numbers.get(0) + sumArrayRecursive(numbers.subList(1, numbers.size()));
//    }

//    public static int sumTotalArraySize(List<Integer> nums) {
//        if (nums.isEmpty()) {
//            return 0;
//        }
//
//        if (nums.size() == 1) {
//            return 1;
//        }
//
//        return 1 + sumTotalArraySize(nums.subList(1, nums.size()));
//    }

//    public static int getBiggerNumberInArray(List<Integer> nums) {
//        if (nums.isEmpty()) return 0;
//        if (nums.size() == 1) return nums.get(0);
//
//        // pega o valor do indice 0;
//        int actualValue = nums.get(0);
//
//        // pega e chama o método passando uma lista sempre começando do indice 1 e pegando o tamanho total
//        int biggerValue = getBiggerNumberInArray(nums.subList(1, nums.size()));
//
//        // pega e compara sempre o valor do indice 0 com o valor atual do bigger value até
//        // chegar ao fim da lista e ver qual foi o maior
//        return Math.max(actualValue, biggerValue);
//    }

//    public static int binarySearchRecursive(List<Integer> nums, int start, int end, int target) {
//        if (start > end) {
//            return -1;
//        }
//
//        int mid = (start + end) / 2;
//
//        if (nums.get(mid) == target) {
//            return mid;
//        }
//
//        // se o valor alvo for menor que o elemento do meio da lista
//        // significa que o valor está a esquerda do elemento do meio (mais pro inicio)
//        // por isso o fim anda mais pra esquerda
//        if (target < nums.get(mid)) {
//            return binarySearchRecursive(nums, start, mid - 1, target);
//        } else {
//            // Se o valor não for menor que o valor do meio
//            // significa que ele está mais pra direita (mais pro fim da lista)
//            // por inicio iniciamos já em uma próxima posição
//            return binarySearchRecursive(nums, mid + 1, end, target);
//        }
//    }
}
