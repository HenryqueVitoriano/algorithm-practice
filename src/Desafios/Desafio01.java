package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {
    /*
    Dado o combustível disponível, o consumo (km por litro) e uma lista de
    distâncias de postos de gasolina, retorne o posto mais distante que ainda
    está dentro do alcance do carro.
    Se nenhum posto estiver dentro do alcance, retorne -1.
     */

    public static void main(String[] args) {


        int combustivel = 3;
        int consumo = 2;

        List<Integer> distancias = Arrays.asList(1, 2, 4, 5);
        int maxdist = combustivel * consumo;

        System.out.println(solution(maxdist, distancias));

    }

    public static int solution(int maximaDistancia, List<Integer> distPosto) {
        int alcance = -1;

        for (int postoCorreto : distPosto) {
            if (maximaDistancia >= postoCorreto) {
                alcance = Math.max(alcance, postoCorreto);
            }
        }

        return alcance;
    }
}
