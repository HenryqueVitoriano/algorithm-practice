package Desafios;

public class Desafio03 {
    /*
    Dada uma matriz de strings binárias (senha fragmentada, uma linha por "pista"),
    para cada coluna, se a soma dos bits for maior ou igual à metade do total de linhas,
    o bit final é 1, senão é 0. Monte a senha final binária e converta para decimal.
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] listaDePistas = {
                "110011010",
                "100001010",
                "111101010",
                "010111010",
                "010011101"};

        int linhas = listaDePistas.length;
        int colunas = listaDePistas[0].length();

        int soma = 0;

        for (int i = 0; i < colunas; i++) {
            for (String binarioAtual : listaDePistas) {
                soma += Integer.parseInt(String.valueOf(binarioAtual.charAt(i)));
            }

            if (soma >= (linhas / 2)) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
            soma = 0;
        }

        System.out.print(solution(stringBuilder.toString()));

    }

    public static int solution(String binario) {
        return Integer.parseInt(String.valueOf(binario), 2);
    }
}
