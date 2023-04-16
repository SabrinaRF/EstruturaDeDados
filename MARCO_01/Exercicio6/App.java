package Exercicio6;

public class App {
    public static void main(String[] args) {
        LSE lista = new LSE();
        Aluno aluno1 = new Aluno("Sabrina");
        Aluno aluno2 = new Aluno("Bibizinha");

        lista.insereInicio(aluno1);
        lista.insereInicio(aluno2);
        lista.insereFim(aluno1);
            
        //System.out.println(lista.tamanho());
        lista.printLista();

    }
            
   
}