package practices.arrays;

import java.util.Arrays;

public class FindAPairWithGivenSumInAnArray {

    // https://medium.com/techie-delight/top-50-classic-data-structures-problems-2a2f68ba924c

    public static void main(String[] args) {
        final int[] nums = {8, 7, 2, 5, 3, 1};
        final var target = 10;

        System.out.println(Arrays.toString(sumPairNumbers(nums, target)));
    }

    public static int[] sumPairNumbers(final int[] nums, final int target) {
        // percore o vector nums - 1 (pegar o tamnho exato)
        for (int i = 0; i < nums.length - 1; i++) {

            // percore o vector nums + 1 (pegar o tamanho exato)
            for (int j = i + 1; j < nums.length; j++) {

                // verifica se a soma dos dois dá o target
                if (nums[i] + nums[j] == target) {

                    // passa os indexs para o vector final
                    final int[] indexs = {i, j};

                    return indexs;
                }
            }
        }
        return null;
    }
}
