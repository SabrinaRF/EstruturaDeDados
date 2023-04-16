package Exercicio5;

public class App {
    public static void main(String[] args) {
        LSE lista = new LSE();

        lista.insereInicio(5);
        lista.insereInicio(1);
        lista.insereFim(6);
        lista.insereInicio(0);
            
        //System.out.println(lista.tamanho());

        lista.printLista();
        lista.remove(5);
        //System.out.println("=============");
        //lista.printLista();

    }
            
   
}