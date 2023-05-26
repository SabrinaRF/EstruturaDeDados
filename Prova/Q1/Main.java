package Q1;


public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.inserir(4);
        lista1.inserir(7);
        lista1.inserir(0);
        
        Lista lista2 = new Lista();
        lista2.inserir(5);
        lista2.inserir(9);
        lista2.inserir(4);
        
        Lista intersecao = lista1.encontrarIntersecao(lista1, lista2);
        
        System.out.println("Interseção: ");
        intersecao.exibirLista();
    }
}