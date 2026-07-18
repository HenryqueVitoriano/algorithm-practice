package Desafios;

public class Desafio07 {
    /*
        Um painel retangular é formado por quadrados de 1x1 cm,
        com um LED em cada vértice/interseção. Dada a altura e largura do painel (em quadrados),
        calcule o número total de LEDs.
     */

    public static void main(String[] args) {
        int altura = 5;
        int largura = 7;

        System.out.print("Quantidade de LEDS: " + solution(altura, largura));
    }

    public static int solution(int altura, int largura){

        return (altura + 1) * (largura + 1);

    }
}
