package algorithms.sort;

import java.util.List;

public class QuickSortBook {

    public static void main(String[] args) {
//        System.out.println(sumArrayRecursive(List.of(1, 2, 3, 4)));
//        System.out.println(sumTotalArraySize(List.of(1, 2, 3, 4)));
//        System.out.println(getBiggerNumberInArray(List.of(1, 4, 3, 2)));
//        System.out.println(binarySearchRecursive(List.of(1, 2, 3, 4), 0, 3, 4));
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
