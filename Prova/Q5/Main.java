package Q5;

import Q5.Pares;

public class Main {
    public static void main(String[] args) {
   
        Noh primeiro = new Noh(10);
        Noh segundo = new Noh(20);
        Noh terceiro = new Noh(30);

        primeiro.setProx(segundo);
        segundo.setProx(terceiro);
        terceiro.setAnt(segundo);
        segundo.setAnt(primeiro);

        int count = nroPares(primeiro);
        System.out.println("Número de elementos pares: " + count);
    }
}