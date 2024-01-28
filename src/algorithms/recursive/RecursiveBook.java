package algorithms.recursive;

public class RecursiveBook {

    public static void main(String[] args) {
        System.out.println(fatorial(3));
    }

    public static int fatorial(int number) {
        if (number == 1) {
            System.out.println(number);
            return 1;
        }

        System.out.println(number);
        return number * fatorial(number - 1);
    }
}
