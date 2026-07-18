package Desafios;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio04 {
    /*
        Dado um texto e uma lista de termos de busca (queries),
        conte quantas vezes cada termo aparece no texto e
        retorne os k termos com mais ocorrências.
     */
    public static void main(String[] args) {
        String texto = "o gato subiu no telhado e o gato dormiu no telhado enquanto o cachorro latia para o gato";
        List<String> termosDeBusca = Arrays.asList("gato", "telhado", "cachorro", "rato");
        int k = 3;

        System.out.print(Solution(texto, termosDeBusca, k));

    }

    public static List<Map.Entry<String, Integer>> Solution(String texto, List<String> termos, int k) {

        Map<String, Integer> contadorStrings = new HashMap<>();


        String[] textoSeparado = texto.split(" ");

        for (String palavra : textoSeparado) {
            if (termos.contains(palavra)) {
                contadorStrings.merge(palavra, 1, Integer::sum);
            }
        }

        return contadorStrings.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(k)
                .collect(Collectors.toList());

    }
}
