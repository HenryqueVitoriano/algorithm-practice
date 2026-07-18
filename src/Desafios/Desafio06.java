package Desafios;


public class Desafio06 {

    /*
        Dado um número e um "número oculto",
        verifique se os dígitos do número oculto aparecem, na mesma ordem
        (não necessariamente consecutivos), dentro do número principal.
     */

    public static void main(String[] args) {

        int numero = 13;
        int numeroOculto = 13;

        System.out.print(solution(numero, numeroOculto));


    }

    public static boolean solution(Integer numero, Integer numeroOculto) {

        if (numeroOculto > numero) {
            return false;
        }

        char[] characters = String.valueOf(numero).toCharArray();
        char[] charactersOcultos = String.valueOf(numeroOculto).toCharArray();

        int resultado = 0;

        for (char character : characters) {
            if (character == charactersOcultos[resultado]) {
                resultado++;

            }

            if (charactersOcultos.length == resultado) {
                return true;
            }

        }

        return false;
    }
}
