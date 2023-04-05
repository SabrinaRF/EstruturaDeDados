package Exercicio3;

import Exercicio3.IVetor;

public class VetorAluno implements IVetor {
    private Aluno[] alunos = new Aluno[5];;
    //private Aluno alunos[];
    private int totalAlunos = 0;

    public VetorAluno(){
        alunos = new Aluno[5];
    }

    @Override
    public void adiciona(Aluno aluno) {
        if (!this.cheio()) {// era pra usar o cheio()
            alunos[totalAlunos] = aluno;
            totalAlunos++;
        }else{
            System.out.println("Vetor cheio!");
        }
    }

    @Override
    public boolean consultar(Aluno aluno) {
        for(int i=0; i< this.totalAlunos ; i++){
            if (aluno.getNome().equals(alunos[i].getNome())) {
                System.out.println(alunos[i].getNome());
                return true;
            }
        }
        return false;
    }

    @Override
    public int tamanho(){
        return this.totalAlunos;
    }

    @Override
    public boolean cheio() {
        if (totalAlunos == this.alunos.length) {
            return true;
        }
        return false;
    }

    @Override
    public void garanteEspaco() {
        if (this.cheio()) {
            Aluno[] novAlunos = new Aluno[this.alunos.length * 2];

            for (int i=0;i< this.alunos.length;i++){
                novAlunos[i] = this.alunos[i];
                this.alunos = novAlunos;
            }
        }
    }

    @Override
    public boolean remover(Aluno aluno) {
        int indice =-1;
        for (int i=0; i<totalAlunos;i++){
            if (aluno == this.alunos[i]) {
                indice = i; 
                break;
            }
        }
        if (indice != -1) {
            for (int i=indice; i<(totalAlunos-1);i++){
                alunos[i] = alunos[i+1];
                totalAlunos--;
                return true;
            }
           
        } return false;
        
    }
    




    
}
