package arrays;

public class TheArrays {

    public static void main(String[] args) {
        // Cria um Vector / Array com 5 espaços (0, 1, 2, 3, 4)
        String[] colors = new String[5];

        // Adiciona a cor no espaço definido (index 0 e 1)
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(colorsArrayString(colors));
    }

    public static String colorsArrayString(String[] colors) {
        final var sb = new StringBuilder();

        // Adiciona o colchetes antes
        sb.append("[");

        // Percorre todo o array colors
        for (int i = 0; i < colors.length; i++) {
            // pega cada color e coloca na string
            sb.append(colors[i]);

            // verifica se o i for igual o valor do array - 1 para termos o valor exato
            if (i == colors.length - 1) {
                // adiciona o outro colchetes para fechar
                return sb.append("]").toString();
            }
            // aqui vai adicionar as virgulas até cair no return
            sb.append(", ");
        }

        return "[]";
    }
}
