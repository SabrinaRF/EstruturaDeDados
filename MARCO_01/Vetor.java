

/**
 * Vetor
 */
public class Vetor {
    private Vetor[] vetor;
    private int totalNum = 0;

    
    public Vetor(){
        this.vetor = new Vetor[5];
    }

    /**
     * @param aluno
     */
    public void adiciona(int n) {
        //if ( ) {
       //     return;
        //}
        vetor[totalNum] = n;
        totalNum++;

    }

    /* public boolean consultar(Aluno aluno) {
        for(int i=0; i< this.totalAlunos ; i++){
            if (aluno.getNome().equals(alunos[i].getNome())) {
                System.out.println(alunos[i].getNome());
                return true;
            }
        }
        return false;
    }*/

    public int tamanho(){
        return this.totalNum;
    }


    public int MaximoValor(Vetor vetor, int inicio, int fim){
        if(inicio == fim){
            return vetor[0];
        }
        
        return fim;

    }
}