package Exercicio6;

public class LSE implements Lista {

    private Noh<Object> inicio;
    private Noh<Object> fim;
    private int totalLista=0;
    
    public LSE () {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(Object o) {
        
        Noh<Object> novo = new Noh<>(o);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            totalLista++;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio=novo;
            totalLista++;
        }
    }

    @Override
    public void insereFim(Object o) {
        
        Noh<Object> novo = new Noh<Object>(o);
        if (fim == null) {
            inicio = novo;
            fim=novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
        
    }

    @Override
    public boolean estahVazia() {
        
        if (inicio == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int tamanho() {
        return totalLista;
        
    }

    public void printLista(){
        Noh<Object> i = inicio;
        while (i != null) {
            System.out.println( i.getObject().toString() + " ");
            i = i.getProximo();
        }
        System.out.println();
        
    }
  
}