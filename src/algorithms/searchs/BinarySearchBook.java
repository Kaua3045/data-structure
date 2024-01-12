package algorithms.searchs;

public class BinarySearchBook {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 10, 12};

        System.out.println(binarySearch(array, 10));
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            }
        }

        throw new RuntimeException("Target not found");
    }

    // array -> {1, 3, 5, 7, 9}
    //           0, 1, 2, 3, 4
    // dividimos o array, o lado esquerdo (left) começa do index 0
    // pegamos o lado direito (right) array.length - 1
    // se esquerda não for menor ou igual a direita continua
    // se o valor do meio é maior que o alvo significa que ele o meio esta muito a frente
    // então diminuimos o valor da direita (right) mid - 1
    // se o valor do meio é menor que o alvo significa que o meio esta antes do alvo
    // então aumentamos o inicio da busca, o valor da esquerda (left) fica mid + 1
    // no primeiro cenário vai dai o left vira 1 em vez de 0
//    public static int binarySearch(int[] array, int target) {
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (array[mid] == target) {
//                return mid;
//            }
//            if (array[mid] > target) {
//                right = mid - 1;
//            } else if (array[mid] < target) {
//                left = mid + 1;
//            }
//        }
//
//        return 0;
//    }
}
