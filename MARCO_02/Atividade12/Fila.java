package Atividade12;


public class Fila implements IFila{ 
    private Noh inicio;
    private Noh fim;

    public Fila(){
        this.inicio = null;
        this.fim = null;
    }
    
    @Override
    public boolean adicionar(Aluno aluno) {
       Noh novo = new Noh(aluno);
        if(this.isEmpty()){
            inicio = novo;
            fim = novo;
       }else{
            fim.setProximo(novo);
            fim = novo;
            return true;
        }
        return false;
    }

    @Override
    public boolean remover() {
        if(!isEmpty()){
            if(inicio == fim){
                inicio = null;
                fim = null;
            }else{
                inicio = inicio.getProximo();
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean isEmpty() {
        return inicio == null && fim == null;
    }    

    @Override
    public int size() {
        int tamanho = 0;
        Noh nohAtual = inicio;
        while (nohAtual != null) {
            tamanho++;
            nohAtual = nohAtual.getProximo();
        }
        return tamanho;
    }

    @Override
    public void imprimirLista() {
        if (isEmpty()) {
            System.out.println("A fila vazia.");
            return;
        }
        Noh nohAtual = inicio;
        while (nohAtual != null) {
            Aluno aluno = (Aluno) nohAtual.getInformacao();
            System.out.println("Nome: "+ aluno.getNome()); 
            System.out.println("idade: "+ aluno.getIdade()); 
            System.out.println("nota: "+ aluno.getNota()); 
            nohAtual = nohAtual.getProximo();
        }
    } 
}