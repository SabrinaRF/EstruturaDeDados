package Exercicio2;
public class VetorAluno  {
    private Aluno[] alunos;
    //pprivate Alhno alunos[];
    private int totalAlunos = 0;

    public VetorAluno(){
        alunos = new Aluno[5];
    }

    /**
     * @param aluno
     */
    public void adiciona(Aluno aluno) {
        if (totalAlunos == alunos.length) {
            return;
        }
        alunos[totalAlunos] = aluno;
        totalAlunos++;
        //this.alunos[this.totalAlunos]= aluno;
        //this.totalAlunos++;
    }

    public boolean consultar(Aluno aluno) {
        for(int i=0; i< this.totalAlunos ; i++){
            if (aluno.getNome().equals(alunos[i].getNome())) {
                System.out.println(alunos[i].getNome());
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.totalAlunos;
    }




    
}
