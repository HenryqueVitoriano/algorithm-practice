package Desafios;

import resources.Participantes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio05 {
    /*

    Dada uma lista de participantes (se são assinantes ou não) e os minutos assistidos por cada um,
    calcule a chance percentual de cada participante ganhar um sorteio — assinantes têm o dobro de
    chances (peso) proporcional ao total de horas assistidas por todos.

     */

    public static void main(String[] args) {
        Participantes joao = new Participantes("João", true, 20);
        Participantes maria = new Participantes("Maria", false, 25);
        Participantes pedro = new Participantes("Pedro", true, 16);
        Participantes giovana = new Participantes("Giovana", false, 29);


        List<Participantes> participantesList = Arrays.asList(joao, maria, pedro, giovana);

        int totalAssistido = 0;

        for (Participantes participantes : participantesList) {
            if (participantes.isAssinante()) {
                totalAssistido += participantes.getTotalDeHorasAssistidas() * 2;
            } else {
                totalAssistido += participantes.getTotalDeHorasAssistidas();
            }
        }

        solution(participantesList, totalAssistido).
                forEach(participantes ->
                        System.out.printf("%s Chances: %.2f \n", participantes.getNome(), participantes.getChancesSorteio()));

    }

    public static List<Participantes> solution(List<Participantes> participantesList, int totalAssistido) {
        participantesList.forEach(participantes -> {
            if (participantes.isAssinante()) {
                participantes.setChancesSorteio((double) (participantes.getTotalDeHorasAssistidas() * 2) / totalAssistido);
            } else {
                participantes.setChancesSorteio((double) participantes.getTotalDeHorasAssistidas() / totalAssistido);
            }
        });

        return participantesList.stream().sorted(Comparator.comparing(Participantes::getChancesSorteio).reversed()).toList();

    }
}
