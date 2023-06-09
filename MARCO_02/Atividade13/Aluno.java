package Atividade13;

public class Aluno {
    private String nome;
    private double nota;
    private int idade;
    private int matricula;

    public Aluno(int matricula, String nome){
        setNome(nome);
        setMatricula(matricula);
    }

    /**
     * @return String return O nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return double return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        
        return getNome();
    }
    
}
