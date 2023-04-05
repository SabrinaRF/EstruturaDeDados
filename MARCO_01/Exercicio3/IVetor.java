package Exercicio3;

import Exercicio3.Aluno;

public interface IVetor {
    public void adiciona(Aluno aluno);
    public int tamanho();
    public boolean consultar(Aluno aluno);
    public boolean cheio();
    public void garanteEspaco();
    public boolean remover(Aluno aluno);
}
