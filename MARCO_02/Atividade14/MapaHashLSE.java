package Atividade14;

public class MapaHashLSE {
    private LSE[] lista;

    public MapaHashLSE(){
        this.lista = new LSE[20];
    }
    private int hash(int chave) {
        return chave % this.lista.length;
    }

    public LSE get(int chave){
        int hash = hash(chave);
        return this.lista[hash];
    }
    public void put(int chave, LSE valor){
        int sondagem = 0;
        int hash;
        while (sondagem <lista.length){
            hash = (hash(chave)+ sondagem) %lista.length;

            if (lista[hash] == null || lista[hash].getMatricula() ==chave) {
               lista[hash] = valor;
                return;
            }
            sondagem++;
        }
    }
    public Aluno remove(int chave) {
        int hash = hash(chave);
        LSE aluno = this.lista[hash];
        this.lista[hash] = null;
        return aluno;
    }

    /*public String print(){
        for(int i=0; i <lista.length; i++){
            String alunos =lista[i].getNome() +vetor[i].getMatricula();
        }
        return alunos;
    }*/
    
}
