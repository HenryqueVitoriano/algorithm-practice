package Desafios;

import java.util.Arrays;
import java.util.List;

//TODO
public class Desafio03 {
    /*
    Dada uma matriz de strings binárias (senha fragmentada, uma linha por "pista"),
    para cada coluna, se a soma dos bits for maior ou igual à metade do total de linhas,
    o bit final é 1, senão é 0. Monte a senha final binária e converta para decimal.
     */
    public static void main(String[] args) {
        List<List<Integer>> matriz = Arrays.asList(
                Arrays.asList(1, 0, 1),
                Arrays.asList(0, 0, 1),
                Arrays.asList(1, 1, 1)
        );

        for (int i = 0; i < matriz.get(i).size(); i++){

        }


    }

    public static int solution(String binario){
        return Integer.parseInt(binario, 2);
    }
}
