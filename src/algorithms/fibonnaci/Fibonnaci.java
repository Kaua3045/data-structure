package algorithms.fibonnaci;

import java.util.ArrayList;
import java.util.List;

public class Fibonnaci {

    public static void main(String[] args) {
        fibonacci(5);
        fibonacci(0);
        fibonacci(-5);
    }

    public static List<Integer> fibonacci(int number) {
        if (number < 0) throw new RuntimeException("Número não pode ser negativo");
        if (number == 0) return List.of();

        List<Integer> result = new ArrayList<>();

        int prev = 0;
        int curr = 1;

        for (int i = 0; i < number; i++) {
            result.add(curr);
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        System.out.println(result);

        return result;
    }
}
