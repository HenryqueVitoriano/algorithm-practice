package Desafios;

import resources.Taxis;

public class Desafio08 {
    /*
        Dadas duas empresas de táxi, cada uma com uma taxa fixa e um valor por km rodado,
        determine qual empresa é mais barata — considerando que a resposta pode depender da
        distância percorrida (retornando a partir de qual km cada empresa se torna mais vantajosa).
     */

    public static void main(String[] args) {
        Taxis taxisA = new Taxis(15.00, 2.00);
        Taxis taxisB = new Taxis(20.00, 1.00);

        int distanciaPercorrida = 100;

        System.out.print(solution(taxisA, taxisB, distanciaPercorrida));
    }

    public static String solution(Taxis taxisA, Taxis taxisB, int distanciaPercorrida){
            boolean vantagemAnterior = taxisA.getTaxaFixa() < taxisB.getTaxaFixa();

            for(int i = 0; i < distanciaPercorrida; i++ ){
                double valorTaxiA = taxisA.getTaxaFixa() + (taxisA.getValorPorKM() * i);
                double valorTaxiB = taxisB.getTaxaFixa() + (taxisB.getValorPorKM() * i);

                if (vantagemAnterior != (valorTaxiA < valorTaxiB)){

                    if (valorTaxiA < valorTaxiB){
                        return "EMPRESA A É MAIS VANTAJOSA A PARTIR DE: " + i + " KM";
                    }

                        return "EMPRESA B É MAIS VANTAJOSA A PARTIR DE: " + i + " KM";
                }
            }

            if (vantagemAnterior){
                return "A EMPRESA A É MAIS VANTAJOSA A VIAGEM TODA";
            }

            return "A EMPRESA B É MAIS VONTAJOSA A VIAGEM TODA";
    }
}
