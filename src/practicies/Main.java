package practicies;

public class Main {

    public static int reverse(int x) {
        int reversed = 0; // declara a variavel reversed como 0
        int pop; // declara a variavel pop

        while (x != 0) { // cria um while que vai ficar em loop se x não for igual 0
            pop = x % 10; // pop recebe o resto da divisão de x por 10
            System.out.println(pop);
            x /= 10; // x recebe o valor da divisão de x por 10

            if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop > 7) { // se reversed for maior que o valor maximo de um inteiro dividido por 10 ou reversed for igual ao valor maximo de um inteiro dividido por 10 e pop for maior que 7
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && pop < -8) { // se reversed for menor que o valor minimo de um inteiro dividido por 10 ou reversed for igual ao valor minimo de um inteiro dividido por 10 e pop for menor que -8
                return 0;
            }

            System.out.println(x);
            System.out.println(reversed);
            reversed = (reversed * 10) + pop; // reversed recebe o valor de reversed multiplicado por 10 mais o valor de pop
            System.out.println(reversed);
        }

        return reversed;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0); // cria uma lista vazia
        ListNode l3 = dummyHead; // declara a variavel l3 como a lista vazia

        int carry = 0; // declara a variavel carry como 0
        while (l1 != null || l2 != null) { // cria um while que vai ficar em loop até l1 ou l2 serem null
            int l1_val = (l1 != null) ? l1.val : 0; // se l1 for null, l1_val recebe 0, se não, recebe o valor de l1
            int l2_val = (l2 != null) ? l2.val : 0; // se l2 for null, l2_val recebe 0, se não, recebe o valor de l2

            int currentSum = l1_val + l2_val + carry; // soma os valores de l1_val, l2_val e carry
            carry = currentSum / 10; // carry recebe o valor da divisão de currentSum por 10
            int lastDigit = currentSum % 10; // lastDigit recebe o resto da divisão de currentSum por 10

            ListNode newNode = new ListNode(lastDigit); // cria um novo nó com o valor de lastDigit
            l3.next = newNode; // l3.next recebe o novo nó

            if (l1 != null) l1 = l1.next; // se l1 não for null, l1 recebe o próximo nó
            if (l2 != null) l2 = l2.next; // se l2 não for null, l2 recebe o próximo nó
            l3 = l3.next; // l3 recebe o próximo nó
        }

        if (carry > 0) { // se carry for maior que 0
            ListNode newNode = new ListNode(carry); // cria um novo nó com o valor de carry
            l3.next = newNode; // l3.next recebe o novo nó
            l3 = l3.next; // l3 recebe o próximo nó
        }

        return dummyHead.next; // retorna a lista
    }

//    public static int sockMerchant(int n, List<Integer> ar) {
//        Map<Integer, Integer> match = new HashMap<>();
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (match.containsKey(ar.get(i))) {
//                match.put(i, match.get(ar.get(i)) + 1);
//            } else {
//                match.put(ar.get(i), 1);
//            }
//        }
//
//        for (int i : match.keySet()) {
//            count += match.get(i) / 2;
//        }
//
//        return count;
//    }

    public static void stairs(int n) {
        /*
        * Esse primeiro for representa a linha da matriz
        *    0, 1, 2
        * 0 [0, 0, #] linha 1
        * 1 [0, #, #] linha 2
        * 2 [#, #, #] linha 3
        *
        * linha 1 e coluna 1 = ao meio da matriz
        * */
        for (int lineIndex = 1; lineIndex < n; lineIndex++) {
            StringBuilder str = new StringBuilder();

            for (int columnIndex = 0; columnIndex < n - lineIndex; columnIndex++) {
                str.append(" ");
            }

            for (int j = 0; j < lineIndex; j++) {
                str.append("#");
            }

            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        reverse(-123);
//        System.out.println(addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4)))));
//        stairs(6);
//        System.out.println(sockMerchant(7, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
//        System.out.println(fourSum(new int[]{2,2,2,2,2}, 8));
//        String s = "pwwkew";
//        int n = s.length();
//        int max = 0;
//        int left = 0;
//
//        Map<Character, Integer> charIndexMap = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//
//            if (charIndexMap.containsKey(c)) {
//                left = Math.max(left, charIndexMap.get(c) + 1);
//            }
//
//            charIndexMap.put(c, i);
//            max = Math.max(max, i - left + 1);
//        }
//
//        System.out.println(max);
    }
}
