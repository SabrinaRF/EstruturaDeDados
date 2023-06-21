package Atividade14;

public class LSE implements Lista {

    private Noh inicio;
    private Noh fim;
    private int totalLista=0;
    
    public LSE () {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(Object o) {
        
        Noh<Object> novo = new Noh(o);
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
        
        Noh novo = new Noh(o);
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
        Noh anterior = null;
        Noh atual = inicio;

        while(atual != null && !atual.getObject().equals(o)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if(atual == null) {
            return false;
        }

        if(anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }

        return true;    
    }

    @Override
    public int tamanho() {
        return totalLista;
        
    }

    @Override
    public String printLista(){
        String lista = "";

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getObject() + " ";
        }

        return lista;
        
    }

   
}