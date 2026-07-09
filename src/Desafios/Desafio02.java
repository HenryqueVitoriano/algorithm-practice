package Desafios;
import java.util.Arrays;
import java.util.List;

public class Desafio02 {
    /*
    Dada uma lista de listas (vendas de vários vendedores),
    considerando apenas vendas entre 20 e 500,
    retorne o menor e o maior valor de venda encontrados.
     */

    public static void main(String[] args) {
        List<Integer> vendasVendedorA = Arrays.asList(25,150,250,375);
        List<Integer> vendasVendedorB = Arrays.asList(50,300,350,380);

        List<List<Integer>> vendasPorVendedor = Arrays.asList(vendasVendedorA, vendasVendedorB);

        System.out.println(solution(vendasPorVendedor));


    }
    public static List<Integer> solution(List<List<Integer>> vendas){
        int maiorVenda = Integer.MIN_VALUE;
        int menorVenda = Integer.MAX_VALUE;

        for(List<Integer> vendedor: vendas){
            for (int venda: vendedor){
                if (venda >= 20 && venda <= 500){
                    maiorVenda = Math.max(maiorVenda, venda);
                    menorVenda = Math.min(menorVenda, venda);
                }
            }
        }

        return Arrays.asList(maiorVenda, menorVenda);
    }

}