package Exercicio8;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int v = new vetor(1000);
       
        Random r = new Random();

        for (int i = 0; i < v.tamanho; i++) {
            int numero = r.nextInt(1000); 
            v.adicionar(numero);
        }

        int valor = v.elemento()[v.tamanho - 1];

        
        int indiceIterativo = v.buscaBinariaIterativa(valor);
        long tempoPesquisaIterativa = v.getTempoDeExecucao();

     
        int indiceRecursivo = v.buscaBinariaRecursiva(valor, 0, num - 1);
        long tempoPesquisaRecursiva = v.getTempoDeExecucao();

        System.out.println("Valor pesquisado: " + valor);
        System.out.println("Tempo de execução: " + tempoPesquisaIterativa);

        System.out.println("Valor pesquisado: " + valor);
        System.out.println("Tempo de execução: " + tempoPesquisaRecursiva);
    }
}