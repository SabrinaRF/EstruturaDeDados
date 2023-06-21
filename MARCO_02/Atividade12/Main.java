public class Main {
    public static void main(String[] args) {
    
        FilaLista fila = new FilaLista();
        Aluno aluno1 = new Aluno("Sabrina", 20, 9;
        Aluno aluno2 = new Aluno("Fernando", 13, 6);
        Aluno aluno3 = new Aluno("Julia", 1, 5.5);
        
        fila.adicionar(aluno1);
        fila.adicionar(aluno2);
        fila.adicionar(aluno3);

        fila.imprimirLista();

        System.out.println("Tamanho: " + fila.size());
        System.out.println("Vazio? " + fila.isEmpty());
    }
}
