package Exercicio3;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno2.setNome("Sabrina");
        VetorAluno vetAlunos = new VetorAluno();
        //vetAlunos.adicionar(aluno1);
        vetAlunos.adiciona(aluno2);
        //vetAlunos.adicionar(aluno3);

        
        //aluno3.setNota(10);

        //vetAlunos.consultar(aluno2.getNome());

        System.out.println(aluno2.getNome());
    }
}
