package arrays.linkedlist;

import utils.Client;

public class LinkedListMain {
    /*
     * cada elemento sabe só quem é seu próximo,
     * com isso ganhamos algumas facilidade e conseguimos fazer operações mais rápidas,
     * como adicionar um novo elemento no final da lista e falamos para o elemento que era o último
     * que agora ele tem um próximo elemento, por isso é uma listada ligada,
     * cada elemento esta ligado ao próximo elemento,
     * se eu remover um elemento do meio eu vou ligar o elemento que estava antes do que foi removido
     * no próximo elemento, ela tem uma tamanho dinamico.
     * mas ela tem um problema, para encontrar um elemento precisa percorer toda a lista,
     * com vetor além de busca linear podemos usar a busca binaria (vamos aprender no futuro)
     * */

    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("AC");
//        list.add("BA");
//        list.add("CE");
//        list.add("DF");
//
//        System.out.println("Tamanho: " + list.getSize());
//        System.out.println("Primeiro: " + list.getFirst().getValue());
//        System.out.println("Último: " + list.getLast().getValue());
//        System.out.println(list.get(0).getValue());
//        System.out.println(list.get(1).getValue());
//        System.out.println(list.get(2).getValue());
//        System.out.println(list.get(3).getValue());
//
//        list.remove("CE");
//        System.out.println("Removeu CE");
//        list.add("SP");
//        System.out.println("Adicionou SP");
//
//        for (int i = 0; i < list.getSize(); i++) {
//            System.out.println(list.get(i).getValue());
//        }

//        LinkedList<Integer> numbers = new LinkedList<>();
//
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//
//        System.out.println("Tamanho: " + numbers.getSize());
//        for (int i = 0; i < numbers.getSize(); i++) {
//            System.out.println(numbers.get(i).getValue());
//        }

//        LinkedList<Client> clients = new LinkedList<>();
//        clients.add(new Client("kaua", "111.111.222-33"));
//        clients.add(new Client("fulano", "222.222.333-44"));
//        clients.add(new Client("beltrano", "333.333.444-55"));
//
//        System.out.println("Tamanho: " + clients.getSize());
//        for (int i = 0; i < clients.getSize(); i++) {
//            System.out.println(clients.get(i).getValue().toString());
//        }
    }
}
