package Atividade11;
public class Main {
    
    public static void main(String[] args) {
        Fila lista = new Fila(4);

        lista.adicionar(5);
        lista.adicionar(1);
        lista.adicionar(3);
        lista.imprimirLista();
        lista.remover();
        lista.imprimirLista();
        lista.adicionar(8);
        lista.imprimirLista();
    }
    
}
